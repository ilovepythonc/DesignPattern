package com.luc.S_;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

public class Iterator {
    public static void main(String[] args) {
        A pa = new B("b");

        
    }
}

class A {

}

@Data
@AllArgsConstructor
class B extends A {
    private String B;
}
