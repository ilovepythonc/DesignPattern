package com.luc.E_Bridge.A.Messager.ext;

import com.luc.E_Bridge.A.Messager.PCMessagerBase;

public class PCMessagerPerfect extends PCMessagerBase {
    @Override
    public void login(String usn, String pwd) {
        super.playSound();
        super.connect();
    }

    @Override
    public void sendMessage(String msg) {
        super.playSound();
        super.writeText();
    }

    @Override
    public void sendPicture(String img) {
        super.playSound();
        super.drawShape();
    }
}
