package com.luc.C_Observer.A;

import lombok.AllArgsConstructor;
import lombok.Data;

// 1.
// 将一个大文件，分割成若干个小文件
@Data
@AllArgsConstructor
public class MainForm {
    private String txtFilePath;     // ==> 大文件路径
    private Integer txtFileNumber;  // ==> 需要分割的数量

    // 2.
    // 触发按钮，分割文件
    public void Button1_Click() {
        FileSplitter splitter = new FileSplitter(txtFilePath, txtFileNumber);

        splitter.split();
    }
    /* 4.
    * 如果一个文件上G，分成10个100M的文件，我希望有一个进度条。
    **/

    // 5.
    // 直接创建一个进度条对象，在分割文件的时候设置精度
    private ProgressBar progressBar;
    public void Button2_Click() {
        ProgressBar progressBar = new ProgressBar(0);

        FileSplitter splitter = new FileSplitter(txtFilePath, txtFileNumber, progressBar);

        splitter.split2();
    }
    /* 7.
    * 这样实现有没有问题？
    *   - 违背了依赖倒置原则
    *     [高层模块不能依赖低层模块，二者都应该依赖抽象。
    *      抽象不能依赖实现细节，实现细节应该依赖抽象。]
    **/
}
