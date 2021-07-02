package com.luc.D_Decorator.B.Streams.E_Decorator;

import com.luc.D_Decorator.B.Stream;

public class BufferedStream extends Decorator {

    public BufferedStream(Stream stream) {
        super(stream);
    }

    @Override
    public char Read(int number) {
        return stream.Read(number);
    }

    @Override
    public void Seek(int position) {
        System.out.print("buffered ");
        stream.Seek(position);
    }

    @Override
    public void Write(char data) {
        stream.Write(data);
    }
}
