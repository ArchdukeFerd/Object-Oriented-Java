public class DepositAccount extends AccountI {
    public DepositAccount(int agency, int number){
        super(agency, number);
    }

    
    /** 
     * @param value
     * @throws InsufficientBalanceException
     */
    @Override
    public void withdraw (double value) throws InsufficientBalanceException {
        double commission = 2;
        super.withdraw(value+commission);
    }

    
    /** 
     * @param value
     */
    @Override
    public void deposit(double value) {
        this.balance = this.balance + value;
    }


}
