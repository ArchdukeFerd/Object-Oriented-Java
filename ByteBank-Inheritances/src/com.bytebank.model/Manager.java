public class Manager extends Official implements Authenticable {
    private AuthenticationUtil util;

    public Manager(){
        this.util = new AuthenticationUtil();
    }

    
    /** 
     * @return double
     */
    public double getBonus(){
        System.out.println("From manager");
        return 25000;
    }

    
    /** 
     * @param key
     */
    @Override
    public void setKey(String key) {
        this.util.setKey(key);
    }

    @Override
    public boolean logIn(String key) {
        return this.util.logIn(key);
    }
}
