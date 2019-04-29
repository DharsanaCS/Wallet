import java.util.Map;

public class Owner {


    private String name;
    private Map<String, Wallet> wallets;


    Owner(String name, Map<String, Wallet> wallets){
        this.wallets = wallets;
    }

    public void addMoney(String walletName, double amount) throws UnknownWalletException {

        Wallet wallet = getWallet(walletName);
        System.out.println("Adding money Rs."+amount);
        wallet.addMoney(amount);
    }

    private Wallet getWallet(String name) throws UnknownWalletException {

        if (wallets.containsKey(name))
            return wallets.get(name);

        throw new UnknownWalletException("Unknown wallet");
    }

    public void removeMoney(String walletName, double amount) throws UnknownWalletException, InsufficientBalanceException {

        Wallet wallet = getWallet(walletName);
        System.out.println("Removing money Rs."+amount);
        wallet.removeMoney(amount);

    }

    public void checkBalance(String walletName) throws UnknownWalletException{

        Wallet wallet = getWallet(walletName);
        System.out.println("Checking balance");
        wallet.checkBalance();
    }
}

