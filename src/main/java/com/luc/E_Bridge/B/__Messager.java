package com.luc.E_Bridge.B;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class __Messager {
    protected MessagerImp messagerImp;

    public abstract void login(String usn, String pwd);
    public abstract void sendMessage(String msg);
    public abstract void sendPicture(String img);
}
