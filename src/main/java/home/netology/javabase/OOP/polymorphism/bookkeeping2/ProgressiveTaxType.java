package home.netology.javabase.OOP.polymorphism.bookkeeping2;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{

    public ProgressiveTaxType() {
    }

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.compareTo(BigDecimal.valueOf(100_000)) >= 0 ? (amount.subtract(amount.multiply(BigDecimal.valueOf(0.15)))) : (amount.subtract(amount.multiply(BigDecimal.valueOf(0.1))));
    }
}