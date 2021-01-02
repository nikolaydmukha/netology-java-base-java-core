package main.java.home.netology.OOP.polymorphism.bookkeeping1;

class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        double taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}

