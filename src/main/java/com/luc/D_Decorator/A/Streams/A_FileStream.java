package com.luc.D_Decorator.A.Streams;


import com.luc.D_Decorator.A.Stream;

//主体类
public class A_FileStream implements Stream {
    @Override
    public char Read(int number) {
        //读文件流
        return 0;
    }

    @Override
    public void Seek(int position) {
        //定位流

    }

    @Override
    public void Write(char data) {
        //写文件流

    }
}
