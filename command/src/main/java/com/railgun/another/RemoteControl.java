package com.railgun.another;

import java.io.RandomAccessFile;

/**
 * Created by GongHuaigu on 2018/5/29.
 * 这是遥控器，可以把命令set到遥控器中后，使用命令控制
 * 遥控器不需要知道具体命令如何执行，只要装载正确的命令，然后执行命令即可。
 * 具体的执行过程（方法调用）被封装在Command中，实现了调用者与执行过程的解耦。
 */
public class RemoteControl {
    Command slot;

    public RemoteControl(){}

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
