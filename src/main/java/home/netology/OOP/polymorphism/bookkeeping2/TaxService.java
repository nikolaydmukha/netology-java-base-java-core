package main.java.home.netology.OOP.polymorphism.bookkeeping2;

import java.math.BigDecimal;

public class TaxService {

    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.4f%n", taxAmount);
    }

}
