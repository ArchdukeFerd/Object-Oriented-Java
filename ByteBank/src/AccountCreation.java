public class AccountCreation {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Account firstAccount = new Account(1, 0);
        firstAccount.deposit(1000);
        System.out.println(firstAccount.getBalance());
        Account secondAccount = new Account(2, 0);
        secondAccount.deposit(500);
        System.out.println(secondAccount.getBalance());
        Account thirdAccount = new Account(3, 0);
        thirdAccount.deposit(400);
        Account fourthAccount = new Account(4, 0);
        fourthAccount.deposit(400);
        if (thirdAccount == fourthAccount){
            System.out.println("They're the same object");
        }
        else {
            System.out.println("They're different objects");
        }
        if (thirdAccount.getBalance() == fourthAccount.getBalance()){
            System.out.println("They're the same object");
        }
        else {
            System.out.println("They're different objects");
        }


    //Deposits to an account
        Account myAccount = new Account(15, 0);
        myAccount.deposit(300);
        //myAccount.deposit(200);
        System.out.println(myAccount.getBalance());

    //Withdrawals from an account
        myAccount.withdraw(575);
        System.out.println(myAccount.getBalance());

    //Transfers between accounts
        Account ximeAccount = new Account(5, 0);
        ximeAccount.deposit(1000);
        if(ximeAccount.transfer(400, myAccount)){
            System.out.println("Successful transfer");
        }
        else {
            System.out.println("Unsuccesful tansfer");
        }
        System.out.println(myAccount.getBalance());
        System.out.println(ximeAccount.getBalance());

    //Referencing classes
        Holder fer = new Holder();
        fer.setName("Fernando");
        fer.setDoc("1922780");
        fer.setPhone("5639162511");

        Account ferAccount = new Account(15, 0);
        ferAccount.setAgency(1);
        ferAccount.setHolder(fer);

        System.out.println(ferAccount.getHolder().getDoc());

        Account luisAccount = new Account(16, 0);
        System.out.println(luisAccount.getHolder().getName());
    }
}
