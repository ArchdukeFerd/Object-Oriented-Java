/**
 * @author archdukeferdinand
 * 
 */
public abstract class AccountI {
    protected double balance;
    private int  agency;
    private int  number;
    private Holder holder = new Holder();

    private static int total;

    /**
     * New account with no parameters
     */
    public AccountI(){

    }

    /**
     * New account with parameters:
     * @param agency
     * @param number
     */
    public AccountI(int agency, int number){
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

    public abstract void deposit(double value);

    /**
     * This method withdraws a value "money" from an account, and if an exception occurs, then throws it
     * @param value
     * @throws InsufficientBalanceException
     */
    public void withdraw(double value) throws InsufficientBalanceException{
        if (this.balance < value){
            throw new InsufficientBalanceException("You don't have enough funds to perform this transaction");
        }
        this.balance -= value;
    }

    
    /** 
     * @param value
     * @param account
     * @return boolean
     * @throws InsufficientBalanceException
     */
    public boolean transfer(double value, AccountI account) throws InsufficientBalanceException{
        if(this.balance >= value){
            this.balance -= value;
            account.deposit(value);
            return true;
        }
        else {
            System.out.println("You don't have enough funds to perform this transaction");
            return false;
        }
    }

    
    /** 
     * @return double
     */
    public double getBalance(){
        return this.balance;
    }
    
    
    /** 
     * @return int
     */
    public int getAgency() {
        return agency;
    }

    
    /** 
     * @param agency
     */
    public void setAgency(int agency) {
    if(agency > 0){
        this.agency = agency;
    }
    else{
        System.out.println("This is not a valid agency");
    }
    }

    
    /** 
     * @return int
     */
    public int getNumber() {
        return number;
    }

    
    /** 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    
    /** 
     * @param holder
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    
    /** 
     * @return Holder
     */
    public Holder getHolder() {
        return holder;
    }

    public static int getTotal(){
        return AccountI.total;
    }

    @Override
    public String toString(){
        String account = "Number: "+this.number+" Agency: "+this.agency+" Holder: "+this.holder.getName();
        return account;
    }

    /*public boolean equals(AccountI account){
        return this.agency == account.getAgency() && this.number == account.getNumber();
    }*/

    @Override
    public boolean equals(Object obj){
        AccountI account = (AccountI) obj;
        return this.agency == account.getAgency() && this.number == account.getNumber();
    }
}
