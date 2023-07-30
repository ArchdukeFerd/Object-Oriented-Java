public class Connection implements AutoCloseable {
    public Connection() {
        System.out.println("Linking connection");
    }
    
    public void readData() {
        System.out.println("Receiving data");
        throw new IllegalStateException();
    }
    
    public void unlink() {
        System.out.println("Unlinking connection");
    }

    
    /** 
     * @throws Exception
     */
    @Override
    public void close() throws Exception {
        unlink();
    }
}
