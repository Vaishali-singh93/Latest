package mywork;

public class ClassChallenge {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setAccountNumber("4567895");
        bank.setAccountBalance(1456.8976);
        bank.setCustomerName("Vaishali Singh");
        System.out.println(bank.fundDeposit(200));
        System.out.println(bank.fundWithdraw(1700));
        System.out.println(bank.fundWithdraw(100));
    }
}
