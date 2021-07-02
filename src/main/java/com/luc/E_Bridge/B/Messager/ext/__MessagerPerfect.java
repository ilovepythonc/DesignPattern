package com.luc.E_Bridge.B.Messager.ext;

import com.luc.E_Bridge.B.MessagerImp;
import com.luc.E_Bridge.B.__Messager;

public class __MessagerPerfect extends __Messager {

    public __MessagerPerfect(MessagerImp messagerImp) {
        super(messagerImp);
    }

    @Override
    public void login(String usn, String pwd) {
        messagerImp.playSound();
        messagerImp.connect();
    }

    @Override
    public void sendMessage(String msg) {
        messagerImp.playSound();
        messagerImp.writeText();
    }

    @Override
    public void sendPicture(String img) {
        messagerImp.playSound();
        messagerImp.drawShape();
    }
}
