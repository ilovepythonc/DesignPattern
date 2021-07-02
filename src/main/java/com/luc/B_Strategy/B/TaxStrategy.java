package com.luc.B_Strategy.B;

// 税法的基类
public interface TaxStrategy {
    /* 3.
    * context为通过上下文取得一些参数
    *
    * 方法本身是稳定不变的，方法的具体实现是可变的
    **/
    double Calculate(Object context);
}
