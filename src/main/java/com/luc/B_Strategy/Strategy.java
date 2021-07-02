package com.luc.B_Strategy;


import com.luc.B_Strategy.A.SalesOrder;
import com.luc.B_Strategy.A.TaxBase;
import com.luc.B_Strategy.B.SalesOrder_;
import com.luc.B_Strategy.B.Taxs.CNTax;

public class Strategy {
    /* 1.
    * 在软件构建过程中，某些对象使用的算法可能多种多样，经常
    * 改变，如果将这些算法都编码到对象中，将会使对象变得异常复杂；
    * 而且有时候支持不使用的算法也是一个性能负担。
    *
    * 如何在运行时根据需要透明地更改对象的算法？ 将算法与对象本
    * 身解耦，从而避免上述问题？
    **/
    public static void main(String[] args) {
        SalesOrder salesOrder = new SalesOrder();
        System.out.println(salesOrder.CalculateTax(TaxBase.US_Tax));

        System.out.println("============");

        SalesOrder_ sales = new SalesOrder_(new CNTax());
        System.out.println(sales.CalculateTax(null));
        // 4.
        // Strategy及其子类为组件提供了一系列可重用的算法，从而可以使
        // 得类型在运行时方便的更具需要在各个算法之间进行切换。

        // Strategy模式提供了使用条件判断语句之外的另一种选择，消除条件
        // 判断语句，就是在解耦合。含有许多条件判断语句的代码通常都需
        // 要Strategy模式

        // 如果Strategy对象没有实例，那么各个上下文都可以共享一个
        // Strategy对象，从而节省对象开销。
    }
}
