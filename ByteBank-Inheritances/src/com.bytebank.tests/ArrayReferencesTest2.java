public class ArrayReferencesTest2 {
    public static void main(String[] args) {
        DepositAccount da = new DepositAccount(1, 2);

        Object[] references = new Object[5];
        references[1] = da;

        references[3] = new SavingsAccount(1, 5);

        System.out.println(references[1]);

        references[0] = new DepositAccount(3, 4);
        System.out.println(references[0]);
        System.out.println(references[3]);

        DepositAccount account = (DepositAccount) references[1];
        System.out.println(account);

        /* SavingsAccount account = (SavingsAccount) accounts[1];
        System.out.println(account); */

        for(int i = 0; i < references.length; i++){
            System.out.println(references[i]);
        }
    }
}
