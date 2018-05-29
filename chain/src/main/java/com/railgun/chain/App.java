package com.railgun.chain;

/**
 * Created by GongHuaigu on 2018/5/29.
 * 责任链模式
 * 责任链模式由 命令对象以及一组处理对象组成，每个handler定义了它能处理的command对象，其他的被其传递给下一个handler，
 */
public class App {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
