package com.luc.B_Strategy.B.Taxs;

import com.luc.B_Strategy.B.TaxStrategy;

public class USTax implements TaxStrategy {
    @Override
    public double Calculate(Object context) {
        System.out.println("US**********");
        return 0f;
    }
}