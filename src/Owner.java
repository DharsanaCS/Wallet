public class Owner {


    private Wallet myWallet;


    Owner(Wallet wallet){
        this.myWallet = wallet;


    }

    public void addMoney(double amount){
        System.out.println("Adding money Rs."+amount);
        myWallet.addMoney(amount);
    }

    public void removeMoney(double amount) {
        System.out.println("Removing money Rs."+amount);

        try {
            myWallet.removeMoney(amount);
        } catch (Exception e) {

            System.out.println ("Exception while removing money: " + e.getMessage());
        }
    }

    public void checkBalance(){
        System.out.println("Checking balance");
        myWallet.checkBalance();
    }
}

