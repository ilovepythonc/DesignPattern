package com.luc.M_Proxy;

interface Subject {
    void process();
}

class RealSubject implements Subject {

    @Override
    public void process() {

    }
}

class Client {
    private final Subject subject;

    public Client(Subject subject) {
        // this.subject = new RealSubject();
        // 不合适，由于各种原因可能无法直接new RealSubject

        this.subject = new Proxy();
    }

    public void doTask() {
        subject.process();
    }
}


/*
 *
 **/
public class Proxy implements Subject{
    @Override
    public void process() {
        // 安全控制
        // 性能提升
        // 分布式访问
    }
}
