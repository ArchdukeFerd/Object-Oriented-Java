public class InternalSystem {
    
    /** 
     * @param manager
     * @return boolean
     */
    //private String key = "2231";
    
    public boolean authenticate(Authenticable manager){
        boolean canLogIn = manager.logIn("2231");
        if (canLogIn){
            System.out.println("Logged in");
            return true;
        }
        else{
            System.out.println("Invalid key, try again");
            return false;
        }
    }
}
