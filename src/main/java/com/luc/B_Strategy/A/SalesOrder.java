package com.luc.B_Strategy.A;

// 计算税收
public class SalesOrder {
    public double CalculateTax(TaxBase tax) {
        //...

        if (tax == TaxBase.CN_Tax) {
            System.out.println("CN**********");
        }
        else if(tax == TaxBase.US_Tax) {
            System.out.println("US**********");
        }
        else if(tax == TaxBase.DE_Tax) {
            System.out.println("DE**********");
        }

        return 0f;
        /* 2.
        * 如果未来支持JP日本，FR法国等不同国家的税法呢？
        *       - 加一个枚举类型，更改if-else
        *       - 违反开闭原则
        *           [对扩展开放，对修改封闭，
        *            类模块应该尽可能的以扩展的方式支持未来的变化，
        *            而不是找到源代码直接改]
        **/
    }
}
