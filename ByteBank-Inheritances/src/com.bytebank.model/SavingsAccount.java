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
}
