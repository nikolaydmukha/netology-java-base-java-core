package main.java.home.netology.OOP.polymorphism.bookkeeping1;

public class VATaxType extends TaxType {

    public double calculateTaxFor(double amount) {

        return amount - (amount * 0.18);
    }

}
