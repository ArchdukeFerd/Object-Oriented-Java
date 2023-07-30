public class OfficialTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Official fer = new Accountant();
        fer.setName("Fernando");
        fer.setDoc("1922780");
        fer.setWage(25000);
        fer.setType(0);

        System.out.println(fer.getWage()+fer.getBonus());
    }
}
