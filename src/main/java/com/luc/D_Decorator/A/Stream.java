package com.luc.D_Decorator.A;

// 业务操作
public interface Stream {
    char Read(int number);
    void Seek(int position);
    void Write(char data);
}