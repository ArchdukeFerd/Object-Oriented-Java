public class Admin extends Official implements Authenticable {
    private AuthenticationUtil util;

    public Admin(){
        this.util = new AuthenticationUtil();
    }

    
    /** 
     * @return double
     */
    @Override
    public double getBonus() {
        return this.getWage();
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
    /*  if(this.key == key){
            return true;
        }
        return false;
    JUST "return this.key == key;" works as well instead of the later conditional
    } */  
}
