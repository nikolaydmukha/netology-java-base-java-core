package home.netology.javabase.OOP.polymorphism.bookkeeping1;

public class ProgressiveTaxType extends TaxType {

    public ProgressiveTaxType() {
    }

    public double calculateTaxFor(double amount) {
        return amount > 100_000 ? (amount - (amount * 0.15)) : (amount - (amount * 0.1));
    }

}
