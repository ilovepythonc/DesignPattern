package com.luc.D_Decorator.A.Streams;

import com.luc.D_Decorator.A.Stream;

public class B_MemoryStream implements Stream {
    @Override
    public char Read(int number) {
        // 读内存流
        return 0;
    }

    @Override
    public void Seek(int position) {
        //定位内存流

    }

    @Override
    public void Write(char data) {
        //写内存流

    }
}
