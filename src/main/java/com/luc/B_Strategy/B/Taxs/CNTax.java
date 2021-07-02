package com.luc.B_Strategy.B.Taxs;

import com.luc.B_Strategy.B.TaxStrategy;

public class CNTax implements TaxStrategy {
    @Override
    public double Calculate(Object context) {
        System.out.println("CN**********");
        return 0f;
    }
}