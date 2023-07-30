public class Holder implements Authenticable {
    private String name;
    private String doc;
    private String phone;

    private AuthenticationUtil util;

    public Holder(){
        this.util = new AuthenticationUtil();
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public boolean logIn(String key) {
        return this.util.logIn(key);
    }
    @Override
    public void setKey(String key) {
        this.util.setKey(key);;
    }
}
