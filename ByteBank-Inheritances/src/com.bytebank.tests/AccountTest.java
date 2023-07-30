public class AccountTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        DepositAccount da = new DepositAccount(1, 1);
        SavingsAccount sa = new SavingsAccount(2, 3);

        da.deposit(2500);
        try {
            da.transfer(1500, sa);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

        System.out.println(da.getBalance());
        System.out.println(sa.getBalance());
    }
}
