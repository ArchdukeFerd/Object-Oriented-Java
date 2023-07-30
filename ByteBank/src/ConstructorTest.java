public class ConstructorTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Account account = new Account(4, 0);
        Account account2 = new Account(3, 0);
        Account account3 = new Account(5, 0);
        System.out.println(account.getAgency());
        System.out.println(account2.getAgency());
        System.out.println(account3.getAgency());
        System.out.println(Account.getTotal());
    }
}
