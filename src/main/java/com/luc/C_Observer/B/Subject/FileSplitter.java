package com.luc.C_Observer.B.Subject;

import com.luc.C_Observer.B.Progress;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileSplitter {
    private String  m_filePath;
    private Integer m_fileNumber;

//    private ProgressBar progressBar;  // ==> 具体通知控件
    private Progress i_Progress;          // ==> 抽象通知机制

    public void split() {
        // 读取大文件
        System.out.println(m_filePath);

        // 分批次向小文件中写入
        for (int i = 0; i < m_fileNumber; i++) {
            // ...
            System.out.println("split.");
            onProgress((i+1f) / m_fileNumber);
        }
    }

    private void onProgress(float value) { // ==> notify
        if (i_Progress != null) {
            i_Progress.DoProgress(value);
        }
    }

}

