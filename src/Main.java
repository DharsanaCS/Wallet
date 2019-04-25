public class Main {

    public static void main(String args[]){

        Owner owner1 = new Owner(new Wallet(100));


        owner1.addMoney(434);
        owner1.removeMoney(200);
        owner1.checkBalance();

    }

}
