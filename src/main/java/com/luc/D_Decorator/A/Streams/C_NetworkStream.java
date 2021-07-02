package com.luc.D_Decorator.A.Streams;

import com.luc.D_Decorator.A.Stream;

public class C_NetworkStream implements Stream {
    @Override
    public char Read(int number) {
        //读网络流
        return 0;
    }

    @Override
    public void Seek(int position) {
        //定位网络流

    }

    @Override
    public void Write(char data) {
        //写网络流

    }
}
