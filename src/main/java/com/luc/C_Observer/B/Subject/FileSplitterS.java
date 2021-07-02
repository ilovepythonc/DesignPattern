package com.luc.C_Observer.B.Subject;

import com.luc.C_Observer.B.Progress;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class FileSplitterS {
    private String  m_filePath;
    private Integer m_fileNumber;

    private List<Progress> i_ProgressList = new ArrayList<>();

    public FileSplitterS(String m_filePath, Integer m_fileNumber) {
        this.m_filePath = m_filePath;
        this.m_fileNumber = m_fileNumber;
    }

    public void add_Observer(Progress progress) {
        i_ProgressList.add(progress);
    }

    public void remove_Observer(Progress progress) {
        i_ProgressList.remove(progress);
    }

    public void split() {

        for (int i = 0; i < m_fileNumber; i++) {
            // ...
            System.out.println("do split.");
            onProgress((i+1f) / m_fileNumber);
        }
    }

    private void onProgress(float value) {
        for (Progress progress : i_ProgressList)
            progress.DoProgress(value);
    }
}

