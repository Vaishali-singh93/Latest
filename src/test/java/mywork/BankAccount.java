package mywork;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;

    public BankAccount() {

    }

    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public double fundDeposit(int amount) {
        accountBalance+=amount;
        return accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double fundWithdraw(int amount) {
        if(accountBalance-amount<0){
            System.out.println("insufficient balance");
        }
        else {
            accountBalance-=amount;
        }
        return accountBalance;
    }
}
