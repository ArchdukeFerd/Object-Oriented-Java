public class BalanceExceptionAccountTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        AccountI account = new SavingsAccount(123, 321);
        account.deposit(200);
        try {
            account.withdraw(250);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}   
