public class BonusControlTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Official luis = new Accountant();
        luis.setWage(25000);

        Manager fernando = new Manager();
        fernando.setWage(40000);

        Accountant luisfer = new Accountant();
        luisfer.setWage(32500);

        BonusControl bonusControl = new BonusControl();

        bonusControl.wageReg(luis);
        bonusControl.wageReg(fernando);
        bonusControl.wageReg(luisfer);
    }
}
