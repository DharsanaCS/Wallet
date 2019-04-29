public abstract class Wallet {

    private double balance;

    Wallet(double balance)
    {
        this.balance = balance;
    }


    public void addMoney(double amount){
        double prevBalance = balance;
        balance = balance + amount;

        balance += getCashBack (prevBalance, amount);

    }

    protected double getCashBack(double initialBalance, double amount) {
        return 0.0;
    }

    public void removeMoney(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Not enough balance");

        balance = balance - amount;
    }

    public void checkBalance(){
        System.out.println("Balance is Rs."+balance);
    }
}
