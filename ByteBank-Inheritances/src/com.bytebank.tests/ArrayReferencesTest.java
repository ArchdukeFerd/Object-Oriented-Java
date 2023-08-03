public class ArrayReferencesTest {
    public static void main(String[] args) {
        DepositAccount da = new DepositAccount(1, 2);

        DepositAccount[] accounts = new DepositAccount[5];
        accounts[1] = da;
        System.out.println(accounts[1]);

        accounts[0] = new DepositAccount(3, 4);
        System.out.println(accounts[0]);
        System.out.println(accounts[3]);

        for(int i = 0; i < accounts.length; i++){
            System.out.println(accounts[i]);
        }
    }
}
