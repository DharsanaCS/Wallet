public class Wallet {



    private double balance;

    Wallet(double balance){
        this.balance = balance;
    }

    public void addMoney(double amount){
        balance = balance + amount;
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
