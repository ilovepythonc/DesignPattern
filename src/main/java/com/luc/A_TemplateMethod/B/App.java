package com.luc.A_TemplateMethod.B;

public class App extends Framework {
    @Override
    protected boolean step2() { // ==> 重写框架中的某个步骤方法
        System.out.println("App s2.");
        return true;
    }

    @Override
    protected void step4() {    // ==> 重写框架中的某个步骤方法
        System.out.println("App s4.");
    }
}
