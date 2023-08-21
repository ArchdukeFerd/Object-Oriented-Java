public class SavingsAccount extends AccountI {
    public SavingsAccount(int agency, int number){
        super(agency, number);
    }

   
   /** 
    * @param value
    */
    @Override
    public void deposit(double value) {
        this.balance = this.balance + value;
    }
    @Override
    public String toString(){
        return super.toString();
    }


    @Override
    public int compareTo(AccountI o) {
        return 0;
    }
}
