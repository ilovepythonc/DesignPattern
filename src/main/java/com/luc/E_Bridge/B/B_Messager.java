package com.luc.E_Bridge.B;

public interface B_Messager {
    // 平台实现
    void login(String usn, String pwd);
    void sendMessage(String msg);
    void sendPicture(String img);

    // 业务抽象
    void playSound();
    void drawShape();
    void writeText();
    void connect();
}