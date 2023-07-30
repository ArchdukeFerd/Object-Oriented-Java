public class ReferencesTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Official official = new Accountant();
        official.setName("Luis");

        Manager manager = new Manager();
        manager.setName("Fernando");

        official.setWage(25000);
        manager.setWage(40000);
    }
}
