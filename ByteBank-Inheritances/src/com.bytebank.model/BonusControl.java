public class BonusControl {
    private double sum;
    
    /** 
     * @param official
     * @return double
     */
    public double wageReg(Official official){
        this.sum = official.getBonus()+this.sum;
        System.out.println("Current status: "+this.sum);
        return this.sum;
    }


    //Polymorphism
    /*
    public double wageReg(Manager manager){
        this.sum = manager.getBonus()+this.sum;
        System.out.println("Current status: "+this.sum);
        return this.sum;
    }

    public double wageReg(Accountant accountant){
        this.sum = accountant.getBonus()+this.sum;
        System.out.println("Current status: "+this.sum);
        return this.sum;
    }
    */
}
