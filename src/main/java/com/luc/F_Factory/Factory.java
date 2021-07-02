package com.luc.F_Factory;

import com.luc.F_Factory.A.FileSplitter;

public class Factory {
    public static void main(String[] args) {
        FileSplitter fileSplitter = new FileSplitter("", 0);
        fileSplitter.split();
    }
}
