public class InternalSystemTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        InternalSystem system = new InternalSystem();
        Manager managertest = new Manager();
        Admin admintest = new Admin();

        system.authenticate(managertest);
        system.authenticate(admintest);
    }
}
