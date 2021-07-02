package com.luc.E_Bridge.A.Messager.ext;

import com.luc.E_Bridge.A.Messager.MobileMessagerBase;

public class MobileMessagerLite extends MobileMessagerBase {
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
