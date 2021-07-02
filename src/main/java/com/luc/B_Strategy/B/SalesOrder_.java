package com.luc.B_Strategy.B;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SalesOrder_ {
    private final TaxStrategy taxStrategy;

    public double CalculateTax(Object context) {
        //...

        //...

        return taxStrategy.Calculate(context);
    }
}
