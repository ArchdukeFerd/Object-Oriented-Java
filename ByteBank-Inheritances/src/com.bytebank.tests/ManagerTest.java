public class ManagerTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        //manager.setWage(40000);
        //Official manager = new Official();
        manager.setWage(40000);
        manager.setKey("Chuu2koi!");
        manager.setType(1);
        

        System.out.println(manager.getWage()+manager.getBonus());
        System.out.println(manager.logIn("Chuu2koi!"));
    }
}
