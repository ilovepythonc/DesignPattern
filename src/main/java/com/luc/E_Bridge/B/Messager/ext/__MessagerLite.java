package com.luc.E_Bridge.B.Messager.ext;

import com.luc.E_Bridge.B.MessagerImp;
import com.luc.E_Bridge.B.__Messager;

// 将B_Messager 拆分，
class __MessagerLite extends __Messager {

    public __MessagerLite(MessagerImp messagerImp) {
        super(messagerImp);
    }

    @Override
    public void login(String usn, String pwd) {
        messagerImp.connect();
    }

    @Override
    public void sendMessage(String msg) {
        messagerImp.writeText();
    }

    @Override
    public void sendPicture(String img) {
        messagerImp.drawShape();
    }
}