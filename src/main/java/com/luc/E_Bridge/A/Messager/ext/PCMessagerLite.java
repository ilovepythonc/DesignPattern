package com.luc.E_Bridge.A.Messager.ext;

import com.luc.E_Bridge.A.Messager.PCMessagerBase;

public class PCMessagerLite extends PCMessagerBase {
    @Override
    public void login(String usn, String pwd) {
        super.connect();
    }

    @Override
    public void sendMessage(String msg) {
        super.writeText();
    }

    @Override
    public void sendPicture(String img) {
        super.drawShape();
    }
}
