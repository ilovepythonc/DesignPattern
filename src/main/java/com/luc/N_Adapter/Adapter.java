package com.luc.N_Adapter;

import lombok.AllArgsConstructor;

interface Target{
    void process();
}

// 遗留问题
class Adaptee {
    public void foo() {

    }
    public int bar() {
        return 0;
    }
}

@AllArgsConstructor
public class Adapter implements Target{
    Adaptee adaptee;

    @Override
    public void process() {
        int data = adaptee.bar();

        adaptee.foo();
        // ...
    }
    /*
    * 把老的接口或其他现有的接口转成一个新的接口
    **/
}
