public class AmazonWallet extends Wallet {

    private static final double cashBackPercent = 20.0;
    private static final double minimumBalanceForCashBack = 1000.0;

    public AmazonWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    protected double getCashBack(double balanceBeforeAddition, double amount) {
        double cashBack = 0.0;

        if (balanceBeforeAddition > minimumBalanceForCashBack) {
            cashBack = (amount * cashBackPercent)/100;
            System.out.println("CashBack is "+cashBack);
        }

        return cashBack;

    }
}
