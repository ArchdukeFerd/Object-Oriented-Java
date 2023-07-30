public abstract class Official {
    private String name;
    private String doc;
    private double wage;
    private int type;

    public Official(){

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
    
    /** 
     * @return String
     */
    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }

    public abstract double getBonus();

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
}
