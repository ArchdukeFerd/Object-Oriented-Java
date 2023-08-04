public class AccountSaver {
    //In this class an object which saves many accounts is going to be created
    //It will also implement a method that adds accounts
    //saveAccount.add(account);
    //get, remove, etc.
    AccountI[] account = new AccountI[10];
    int index = 0;

    public void add(AccountI da) {
        account[index] = da;
        index++;
    }
    public AccountI get(int index){
        return account[index];
    }
}
