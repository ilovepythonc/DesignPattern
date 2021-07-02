package com.luc.D_Decorator.B.Streams;

import com.luc.D_Decorator.B.Stream;
import lombok.AllArgsConstructor;

public class D_Stream {
}

// 修改 1.
@AllArgsConstructor
class CryptoFileStream {
    A_FileStream fileStream; // 将继承改为组合

    char Read(int number) {
        return fileStream.Read(number);
    }

    void Seek(int position) {
        fileStream.Seek(position);
    }

    void Write(char data) {
        fileStream.Write(data);
    }
}

@AllArgsConstructor
class CryptoMemoryStream {
    B_MemoryStream memoryStream; // 将继承改为组合

    char Read(int number) {
        return memoryStream.Read(number);
    }

    void Seek(int position) {
        memoryStream.Seek(position);
    }

    void Write(char data) {
        memoryStream.Write(data);
    }
}

@AllArgsConstructor
class CryptoNetworkStream {
    C_NetworkStream networkStream; // 将继承改为组合

    char Read(int number) {
        return networkStream.Read(number);
    }

    void Seek(int position) {
        networkStream.Seek(position);
    }

    void Write(char data) {
        networkStream.Write(data);
    }
}
// 当A变量类型都是B类型的子类时，把A的类型申明成B
@AllArgsConstructor
class _CryptoFileStream {
    Stream stream; // = new FileStream()

    char Read(int number) {
        return stream.Read(number);
    }

    void Seek(int position) {
        stream.Seek(position);
    }

    void Write(char data) {
        stream.Write(data);
    }
}

@AllArgsConstructor
class _CryptoMemoryStream {
    Stream stream; // = new MemoryStream()

    char Read(int number) {
        return stream.Read(number);
    }

    void Seek(int position) {
        //...
    }

    void Write(char data) {
        //...
    }
}

@AllArgsConstructor
class _CryptoNetworkStream {
    Stream stream; // = new NetworkStream()

    //...
}

// 这样看，这三各类不是都一样吗,只是叫不同名字而已？
// 那还要三个干嘛
@AllArgsConstructor
class __CryptoStream {
    Stream stream; // = new ...

    char Read(int number) {
        return stream.Read(number);
    }

    void Seek(int position) {
        stream.Seek(position);
    }

    void Write(char data) {
        stream.Write(data);
    }
}