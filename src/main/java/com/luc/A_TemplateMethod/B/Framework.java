package com.luc.A_TemplateMethod.B;

public abstract class Framework {
    private void step1() {
        System.out.println("lib s1");
    }

    private void step3() {
        System.out.println("lib s3");
    }

    private void step5() {
        System.out.println("lib s5");
    }

    protected abstract boolean step2();

    protected abstract void step4();

    /* 稳定的template method

        假设run方法相对稳定
         -核心流程被屏蔽，application无法知道具体流程-
    */
    public void run() {
        step1();

        if(step2()) { // 支持变化 ==> 抽象函数的多态调用
            step3();
        }

        for (int i = 0; i < 4; i++) {
            step4();  // 支持变化 ==> 抽象函数的多态调用
        }

        step5();
    }
}
