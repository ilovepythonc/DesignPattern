package com.luc.D_Decorator.B;

public interface Stream {
    char Read(int number);
    void Seek(int position);
    void Write(char data);
}