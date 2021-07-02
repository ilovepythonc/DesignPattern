package com.luc.A_TemplateMethod.A;

public class APP {
    Library lib = new Library();

    protected boolean step2() {
        System.out.println("app s2");
        return true;
    }

    protected void step4() {
        System.out.println("app s4");
    }

    /*
        所有运行逻辑都需要开发人员来写
     */
    public void run() {
        lib.step1();        // ==> 调用写好的三方库函数

        if (step2()) {
            lib.step3();    // ==> 调用写好的三方库函数
        }

        for (int i = 0; i < 4; i++) {
            step4();
        }

        lib.step5();        // ==> 调用写好的三方库函数
    }
}
