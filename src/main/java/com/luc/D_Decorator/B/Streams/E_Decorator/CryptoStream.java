package com.luc.D_Decorator.B.Streams.E_Decorator;

import com.luc.D_Decorator.B.Stream;
import lombok.AllArgsConstructor;


public class CryptoStream extends Decorator {

    public CryptoStream(Stream stream) {
        super(stream);
    }

    @Override
    public char Read(int number) {
        return stream.Read(number);
    }

    @Override
    public void Seek(int position) {
        System.out.print("crypto ");
        stream.Seek(position);
    }

    @Override
    public void Write(char data) {
        stream.Write(data);
    }
}