package com.luc.P_State.B;

import lombok.AllArgsConstructor;

// 提取抽象基类
@AllArgsConstructor
abstract class NetworkState{
    public NetworkState pNext;
    public abstract void operation1();
    public abstract void operation2();
    public abstract void operation3();
}

// 实现具体算法
class OpenState extends NetworkState {
    private static NetworkState m_instance;

    public OpenState() {
        super(null);
    }

    public static NetworkState getInstance() {
        if (m_instance == null) {
            m_instance = new OpenState();
        }
        return m_instance;
    }

    @Override
    public void operation1() {
        // ......
        pNext = OpenState.getInstance();
    }

    @Override
    public void operation2() {
//        pNext = CloseState.getInstance();
    }

    @Override
    public void operation3() {
//        pNext = ConnectState.getInstance();
    }
}


// class CloseState {}
// class ...

@AllArgsConstructor
public class S2 {
    public NetworkState pState;

    public void operation1() {
        // ...
        pState.operation1();
        pState = pState.pNext;
        // ...
    }
}

// 如果增加了一种状态
class WaitState extends NetworkState {
    public WaitState() {
        super(null);
    }
//        singleton() {}

    @Override
    public void operation1() {
//        pNext = ???.getInstance(); 自己去指定下一个状态
    }

    @Override
    public void operation2() {}

    @Override
    public void operation3() {}
}
