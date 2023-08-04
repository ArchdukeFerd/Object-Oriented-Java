public class AccountSaverTest {
    public static void main(String[] args) {
        AccountSaver accountSaver = new AccountSaver();
        AccountI da = new DepositAccount(1, 2);
        accountSaver.add(da);
        AccountI da2 = new DepositAccount(3, 4);
        accountSaver.add(da2);

        accountSaver.get(1);
        System.out.println(accountSaver.get(0));
        System.out.println(accountSaver.get(1));
    }
}
