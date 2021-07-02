package com.luc.D_Decorator.B.Streams.E_Decorator;

import com.luc.D_Decorator.B.Stream;
import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract class Decorator implements Stream { // 继承Stream是为了完善接口的规范
    protected Stream stream; // 组合stream是为了将来支持具体的实现
}