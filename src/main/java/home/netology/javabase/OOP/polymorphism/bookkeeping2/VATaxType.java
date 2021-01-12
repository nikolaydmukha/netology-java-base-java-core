package main.java.home.netology.javabase.OOP.polymorphism.bookkeeping2;

import java.math.BigDecimal;

public class VATaxType extends TaxType{

    public BigDecimal calculateTaxFor(BigDecimal amount) {

        return amount.subtract(amount.multiply(BigDecimal.valueOf(0.18)));
    }

}