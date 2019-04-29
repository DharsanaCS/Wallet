import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]){

        Map<String,Wallet> wallets = new HashMap<String,Wallet>();
        wallets.put(WalletNames.AMAZON_PAY,new AmazonWallet(1001) );
        wallets.put(WalletNames.GOOGLE_PAY,new GoogleWallet(101) );


        Owner owner1 = new Owner("Dharsana", wallets);

        try {
            owner1.addMoney(WalletNames.AMAZON_PAY, 500);
            owner1.removeMoney(WalletNames.AMAZON_PAY, 100);
            owner1.checkBalance(WalletNames.AMAZON_PAY);
        } catch (Exception e) {
            System.out.println ("Exception :" + e.getMessage());
        }

    }

}
