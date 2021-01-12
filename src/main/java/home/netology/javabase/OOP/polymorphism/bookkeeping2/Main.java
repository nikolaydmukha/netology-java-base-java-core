package main.java.home.netology.javabase.OOP.polymorphism.bookkeeping2;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(BigDecimal.valueOf(2250.5489), new VATaxType(), new TaxService()),
                new Bill(BigDecimal.valueOf(100_000.00), new IncomeTaxType(), new TaxService()),
                new Bill(BigDecimal.valueOf(1_000_000.00), new ProgressiveTaxType(), new TaxService())
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }

}


