package home.netology.javabase.OOP.polymorphism.bookkeeping1;

public class Main {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(2000.00, new VATaxType(), new TaxService()),
                new Bill(100_000.00, new IncomeTaxType(), new TaxService()),
                new Bill(1_000_000.00, new ProgressiveTaxType(), new TaxService())
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
