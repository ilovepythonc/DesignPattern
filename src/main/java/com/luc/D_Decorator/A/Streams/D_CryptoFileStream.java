package com.luc.D_Decorator.A.Streams;

// 扩展操作
public class D_CryptoFileStream extends A_FileStream {
    @Override
    public char Read(int number) {
        // 额外的操作...
        return super.Read(number);
    }

    @Override
    public void Seek(int position) {
        // 额外的操作...
        super.Seek(position);
        // 额外的操作...
    }

    @Override
    public void Write(char data) {
        // 额外的操作...
        super.Write(data);
        // 额外的操作...
    }
    /*
    * 这是针对文件流的加密操作，那对内存流，网络流呢。同样也有这样的需求
    **/
}


class CryptoNetworkStream extends C_NetworkStream {
    @Override
    public char Read(int number) {
        // 额外的操作...
        return super.Read(number);
    }

    @Override
    public void Seek(int position) {
        // 额外的操作...
        super.Seek(position);
        // 额外的操作...
    }

    @Override
    public void Write(char data) {
        // 额外的操作...
        super.Write(data);
        // 额外的操作...
    }
}

class CryptoMemoryStream extends B_MemoryStream {
    // ...
}

// 缓冲呢
class BufferedFileStream extends A_FileStream{
    // ...
}
class BufferedMemoryStream extends B_MemoryStream{
    // ...
}
class BufferedNetworkStream extends C_NetworkStream{
    // ...
}

// 即加密又缓冲 ?
class CryptoBufferedFileStream extends A_FileStream {
    @Override
    public char Read(int number) {
        // 额外的加密操作...
        // 额外的缓冲操作...
        return super.Read(number);
    }

    @Override
    public void Seek(int position) {
        // 额外的加密操作...
        // 额外的缓冲操作...
        super.Seek(position);
        // 额外的加密操作...
        // 额外的缓冲操作...
    }

    // ...
}

// 这么做有什么问题？
//