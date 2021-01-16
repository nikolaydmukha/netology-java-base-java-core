package home.netology.javabase.abstract_interface.banking;

public class Main {
    public static void main(String[] args) {
        try {
            CreditAccount creditAccount = new CreditAccount(-10_000);
            SavingsAccount savingAccount = new SavingsAccount(200_000);
            CheckingAccount checkingAccount = new CheckingAccount(500_000);

            System.out.println("Баланс кредитного счета " + creditAccount.getBalance());
            System.out.println("Баланс расчетного счета " + checkingAccount.getBalance());

            creditAccount.transfer(checkingAccount, 2000);
            System.out.println("Баланс расчетного счета после перевода на него " + checkingAccount.getBalance());
            System.out.println("Баланс кредитного счета после перевода с него " + creditAccount.getBalance());

            savingAccount.transfer(creditAccount, 5000);
            System.out.println("Баланс сберегательного счета после перевода с него " + savingAccount.getBalance());
            System.out.println("Баланс кредитного счета после перевода на него " + creditAccount.getBalance());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
