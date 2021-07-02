package com.luc.C_Observer.B.Observer_Listener;

import com.luc.C_Observer.B.Progress;
import com.luc.C_Observer.B.Subject.FileSplitterS;
import lombok.AllArgsConstructor;
import lombok.Data;

// 1.
// 将一个大文件，分割成若干个小文件
@Data
@AllArgsConstructor
public class MainForm implements Progress {
    private String txtFilePath;     // ==> 大文件路径
    private Integer txtFileNumber;  // ==> 需要分割的数量


    public void Button1_Click() {
        FileSplitterS splitter = new FileSplitterS(txtFilePath, txtFileNumber);

        splitter.add_Observer(this);
        splitter.add_Observer(new SecondFrom());

        splitter.split();
    }

    @Override
    public void DoProgress(float value) {
        System.out.println(value);
    }
}

class SecondFrom implements Progress {
    @Override
    public void DoProgress(float value) {
        System.out.println(".");
    }
}
