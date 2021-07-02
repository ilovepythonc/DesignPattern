package com.luc.B_Strategy.B.Taxs;

import com.luc.B_Strategy.B.TaxStrategy;

public class DETax implements TaxStrategy {
    @Override
    public double Calculate(Object context) {
        System.out.println("DE**********");
        return 0f;
    }
}