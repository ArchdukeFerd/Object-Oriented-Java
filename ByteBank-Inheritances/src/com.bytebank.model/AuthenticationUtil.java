public class AuthenticationUtil {
    private String key;

    
    /** 
     * @param key
     * @return boolean
     */
    public boolean logIn(String key){
        return this.key == key;
    }

    
    /** 
     * @param key
     */
    public void setKey(String key){
        this.key = key;
    }
}
