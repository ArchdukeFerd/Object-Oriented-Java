public class Accountant extends Official {
    
    /** 
     * @return double
     */
    @Override
    public double getBonus(){
        System.out.println("From accountant");
        return 6000;
    }
}
