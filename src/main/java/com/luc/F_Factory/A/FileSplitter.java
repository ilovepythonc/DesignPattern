package com.luc.F_Factory.A;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileSplitter {
    private String  m_filePath;
    private Integer m_fileNumber;

    // 3.
    public void split() {
        // 读取大文件
        System.out.println(this.m_filePath);

        // 分批次向小文件中写入
        for (int i = 0; i < this.m_fileNumber; i++) {
            // ...
            System.out.println("split.");
        }
    }
}