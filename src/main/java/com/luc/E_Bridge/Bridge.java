package com.luc.E_Bridge;

import com.luc.E_Bridge.A.A_Messager;
import com.luc.E_Bridge.A.Messager.ext.MobileMessagerPerfect;
import com.luc.E_Bridge.B.Messager.PCMessagerImp;
import com.luc.E_Bridge.B.Messager.ext.__MessagerPerfect;
import com.luc.E_Bridge.B.__Messager;

public class Bridge {
    /*
    * 由于某些类型的固有的实现逻辑，使得它们具有两个变化的维度，
    * 乃至多个维度的变化。
    *
    * 如何应对这种“多维度的变化”？ 如何利用面向对象技术来使得类型
    * 可以轻松地沿着两个乃至多个方向变化，而不引入额外的复杂的？
    **/
    public static void main(String[] args) {
        // 当我们需要一个完美的手机
        A_Messager messager = new MobileMessagerPerfect();

        System.out.println("===========================");


        __Messager message = new __MessagerPerfect(new PCMessagerImp());

        /**
         * 如果一个类有多个变化维度，那么把这那些属于一个维度的方法合在一起，打包成一个基类，
         * 在自己类内部用一个抽象指针指向它
         **/

    }
}
