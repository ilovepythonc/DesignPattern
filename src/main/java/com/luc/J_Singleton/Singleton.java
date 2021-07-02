package com.luc.J_Singleton;

public class Singleton {
    private Singleton() {}
    private Singleton(Singleton singleton) {}

    private static Singleton m_instance;

    // 线程非安全
    public static Singleton getInstance() {
        if (m_instance == null) {
            m_instance = new Singleton();
        }
        return m_instance;
    }

    // 线程安全, 锁代价太高
    public static Singleton getInstance2() {
        // Lock lock;
        if (m_instance == null) {
            m_instance = new Singleton();
        }
        /**
         * 每一次进来都要锁住，但是只要这个单例对象创建完成
         * 后续就只是读取操作，不需要这个锁
         */
        return m_instance;
    }

    // 双检查锁，但由于内存读写reorder不安全
    public static Singleton getInstance3() {

        if (m_instance == null) {
            // Lock lock;
            if (m_instance == null) {
                m_instance = new Singleton();
                // 1.分配内存 2.调用构造器 3.返回内存指针

                // 但是在cpu 指令重排reorder的时候
                // 可能会出现 1 3 2的顺序
                // 加 volatile 关键字，禁止指令重排
                // ==> private static volatile Singleton m_instance;
            }
        }
        return m_instance;
    }
}
