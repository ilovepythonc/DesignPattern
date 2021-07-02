package com.luc.C_Observer.A;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileSplitter {
    private String  m_filePath;
    private Integer m_fileNumber;

    public FileSplitter(String m_filePath, Integer m_fileNumber) {
        this.m_filePath = m_filePath;
        this.m_fileNumber = m_fileNumber;
    }

    // 3.
    public void split() {
        // 读取大文件
        System.out.println(m_filePath);

        // 分批次向小文件中写入
        for (int i = 0; i < m_fileNumber; i++) {
            // ...
            System.out.println("split.");
        }
    }

    /* 8.
    * 该成员变量为实现细节
    * 未来如果不显示进度条，显示 。。。。。或者直接展示百分比呢
    *
    * 实现细节是非常容易改变的
    *
    * 不去依赖A， 而去依赖A的基类
    * 如果去依赖ProgressBar的父类，ControllerBase会发现
    *  ControllerBase 可没有 setValue()方法，甚至都没有
    *  跟新界面进度条值的方法
    * 所以单纯的找基类是很粗浅的认识。
    *
    * ============================================
    *
    * 那么 ProgressBar 到底扮演了什么角色？
    * ProgressBar是一个 -通 知- ，是不是可以用一种抽象的方式来
    * 表达这样一种通知，而不是一个具体的控件
    * */
    private ProgressBar progressBar; // ==> 产生编译时依赖

    // 6.
    public void split2() {
        // 读取大文件
        System.out.println(m_filePath);

        // 分批次向小文件中写入
        for (int i = 0; i < m_fileNumber; i++) {
            // ...
            System.out.println("split.");
            if (progressBar != null) {
                progressBar.setValue((i+1f) / m_fileNumber);
                // show
                System.out.println(progressBar.getValue());
            }
        }
    }
}

