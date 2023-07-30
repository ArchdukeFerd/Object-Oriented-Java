public class Account {
    protected double balance;
    private int  agency;
    private int  number;
    private Holder holder = new Holder();

    private static int total = 0;

    public Account(int agency, int number){
        if(agency <= 0){
            System.out.println("Zero or negative agencies are not valid arguments");
            this.agency = 1;
            this.number = 1;
        }
        else {
            this.agency = agency;
            this.number = number;
        }
        total++;
        System.out.println("There are "+total+" created accounts in total");
    }

    
    /** 
     * @param value
     */
    public void deposit(double value){
        this.balance = this.balance + value;
    }

    
    /** 
     * @param value
     * @return boolean
     */
    public boolean withdraw(double value){
        if(this.balance>=value){
            this.balance = this.balance - value;
            return true;
        }
        else{
            System.out.println("You don't have enough funds to perform this transaction");
            return false;
        }
    }

    public boolean transfer(double value, Account account){
        if(this.balance>=value){
            this.balance = this.balance - value;
            account.deposit(value);
            return true;
        }
        else {
            return false;
        }
    }

    public double getBalance(){
        return this.balance;
    }
    
    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
    if(agency > 0){
        this.agency = agency;
    }
    else{
        System.out.println("This is not a valid agency");
    }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Holder getHolder() {
        return holder;
    }

    public static int getTotal(){
        return Account.total;
    }
}
