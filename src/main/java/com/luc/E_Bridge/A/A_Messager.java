package com.luc.E_Bridge.A;

public interface A_Messager {
    void login(String usn, String pwd);
    void sendMessage(String msg);
    void sendPicture(String img);

    void playSound();
    void drawShape();
    void writeText();
    void connect();
}
