public class EncapsulationTest {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Account account = new Account(15, 0);
        Holder holder = new Holder();
        holder.setName("Fer");
        holder.setDoc("ffdfdfd");

        account.setHolder(holder);

        System.out.println(holder.getName());
        System.out.println(account.getHolder().getName());
    }
}
