package main.java.home.netology.javabase.collections.queuecollection.transactions;

import java.math.BigDecimal;

public class Transaction {
    private Account fromAccount;
    private Account toAccount;
    BigDecimal amount;

    public Transaction(Account fromAccount, Account toAccount, BigDecimal amouunt) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amouunt;
    }

    public  boolean makeTransaction(){
        fromAccount.setAmount(fromAccount.getAmount().subtract(amount));
        if (fromAccount.getAmount().compareTo(BigDecimal.ZERO) < 0) {
            fromAccount.setAmount(fromAccount.getAmount().add(amount));
            return false;
        }
        toAccount.setAmount(toAccount.getAmount().add(amount));
        return true;
    }
    @Override
    public String toString() {
        return String.format("со счета: %s, на счет: %s, сумма: %s", fromAccount.getAccount(), toAccount.getAccount(), amount);
    }
}
