package com.luc.A_TemplateMethod;

import com.luc.A_TemplateMethod.A.APP;
import com.luc.A_TemplateMethod.B.App;
import com.luc.A_TemplateMethod.B.Framework;

public class TemplateMethod {
    /* 1.
    * 在软件构建过程中，对于某一项任务，它常常有 -稳定- 的整体操作
    * 结构，但各个子步骤却有很多 -改变- 的需求，或者由于固有的原因
    * (比如框架与应用之间的关系) 而无法和任务的整体结构同时实现。
    *
    * 如何在确定 -稳定操作- 结构的前提下，来灵活应对各个子步骤的 -变化-
    * 或者晚期实现需求？
    **/
    public static void main(String[] args) {
        APP app = new APP();
        app.run();
        System.out.println("======");
        Framework fwk = new App();
        fwk.run();
    }
}
