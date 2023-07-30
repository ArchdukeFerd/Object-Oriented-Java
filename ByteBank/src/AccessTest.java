public class AccessTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Account account = new Account(0, 0);
        account.setAgency(-22);
        account.deposit(301);
        account.withdraw(300);

        System.out.println(account.getBalance());
        System.out.println(account.getAgency());
    }
}
