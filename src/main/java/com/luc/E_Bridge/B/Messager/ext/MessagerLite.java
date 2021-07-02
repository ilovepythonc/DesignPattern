package com.luc.E_Bridge.B.Messager.ext;

import com.luc.E_Bridge.B.B_Messager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class MessagerLite{
    B_Messager messager; // ==> new PCMessagerBase 不合适，pcmessager是一个抽象类

    public void login(String usn, String pwd) {
        messager.connect();
    }

    public void sendMessage(String msg) {
        messager.writeText();
    }

    public void sendPicture(String img) {
        messager.drawShape();
    }
}
