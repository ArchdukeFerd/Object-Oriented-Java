public class ArrayReferencesTest {
    public static void main(String[] args) {
        DepositAccount da = new DepositAccount(1, 2);

        AccountI[] accounts = new AccountI[5];
        accounts[1] = da;

        accounts[3] = new SavingsAccount(1, 5);

        System.out.println(accounts[1]);

        accounts[0] = new DepositAccount(3, 4);
        System.out.println(accounts[0]);
        System.out.println(accounts[3]);

        DepositAccount account = (DepositAccount) accounts[1];
        System.out.println(account);

        /* SavingsAccount account = (SavingsAccount) accounts[1];
        System.out.println(account); */

        for(int i = 0; i < accounts.length; i++){
            System.out.println(accounts[i]);
        }
    }
}
