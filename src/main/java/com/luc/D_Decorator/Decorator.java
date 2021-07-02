package com.luc.D_Decorator;

import com.luc.D_Decorator.A.Streams.D_CryptoFileStream;
import com.luc.D_Decorator.B.Streams.A_FileStream;
import com.luc.D_Decorator.B.Streams.E_Decorator.BufferedStream;
import com.luc.D_Decorator.B.Streams.E_Decorator.CryptoStream;

public class Decorator {
    /*
    * 在某些情况下我们可能会“过度地使用继承来扩展对象的功能”，由
    * 于继承为类型引入的静态特质，使得这种扩展方式缺乏灵活性；并
    * 且随着子类的增多（扩展功能的增多），各种子类的组合（扩展功
    * 能的组合）会导致更多子类的膨胀。
    *
    * 如何使“对象功能的扩展”能够根据需要来动态地实现? 同时避免
    * “扩展功能的增多”带来的子类膨胀问题？从而使得任何“功能扩展变
    * 化”所导致的影响降为最低？
    **/
    public static void main(String[] args) {
        D_CryptoFileStream cryptoFileStream = new D_CryptoFileStream();

        System.out.println("=======================");
        A_FileStream fileStream = new A_FileStream();
        CryptoStream cryptoStream = new CryptoStream(fileStream);
        BufferedStream bufferedStream = new BufferedStream(cryptoStream);

        bufferedStream.Seek(1);

    }
    // 通过采用组合而非继承的手法，Decorator模式实现了运行时动
    // 态扩展对象功能的能力，而且可以根据需要扩展多个功能。避免
    // 使用继承带来的“灵活性查”和“多子类衍生”问题。

    // Decorator类在接口上表现为is-a component的继承关系，即
    // Decorator类继承了Component类所具有的接口。但在是现实又表
    // 现为has-a component的组合关系，即Decorator类又使用了另外
    // 一个component类

    // Decorator模式的目的并非解决“多子类衍生的多继承”问题，
    // Decorator模式应用的要点在于解决“主体类在多个方向上的扩展功
    // 能” ———— 是为 “装饰”的含义。
}
