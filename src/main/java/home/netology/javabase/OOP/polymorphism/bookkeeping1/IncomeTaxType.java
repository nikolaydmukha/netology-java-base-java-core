package home.netology.javabase.OOP.polymorphism.bookkeeping1;

public class IncomeTaxType extends TaxType {
    public double calculateTaxFor(double amount) {

        return amount - (amount * 0.13);
    }
}
