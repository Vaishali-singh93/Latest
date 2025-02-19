package onboardlearning.behaviourderiven;

public class Account {

    private int balance;
    private int requestedAmount;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void requestAmount(int requestedAmount) {
        this.requestedAmount=requestedAmount;
        System.out.println("requested amount is :"+requestedAmount);

    }
    public int amountDispensed(int amount) {
        if(amount==requestedAmount) {
            if (requestedAmount > balance) {
                System.out.println("account ran out of balance");
            } else if (requestedAmount < balance) {
                balance = balance - requestedAmount;

            }
        }
        return requestedAmount;
    }
}
