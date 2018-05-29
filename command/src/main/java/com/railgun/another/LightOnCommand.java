package com.railgun.another;

import java.util.List;

/**
 * Created by GongHuaigu on 2018/5/29.
 * 这是一个打开点灯的命令，执行的时候需要传入点灯进行操作
 */
public class LightOnCommand implements Command{

    Light light;

    @Override
    public void execute() {
        light.on();
    }

    public LightOnCommand(Light light){
        this.light = light;
    }
}
