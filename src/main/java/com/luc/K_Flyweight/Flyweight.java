package com.luc.K_Flyweight;

import java.util.Map;

public class Flyweight {

}

class FontFactory {
    private Map<String, Font> fontPool;

    public Font getFont(String key) {
        Font font = fontPool.get(key);

        if(font != null) {
            return font;
        }
        else {
            Font f = new Font(key);
            fontPool.put(key, f);
            return f;
        }
        /**
         * 采用对象共享的做法来降低系统中对象的个数，从而降
         * 低细粒度对象给系统带来的内存压力。在具体实现方向，要注意对
         * 象状态的处理。
         */
    }
}

class Font {
    public Font(String key) {
        // ...
    }
}