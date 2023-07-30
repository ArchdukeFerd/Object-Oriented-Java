public class ConnectionTest {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try(Connection connection = new Connection()){
            connection.readData();
        }
        catch (IllegalStateException ie){
            System.out.println("Here's the exception");
            ie.printStackTrace();
        }
  /*       Connection connection = null;
        try {
            connection = new Connection();
            connection.readData();
        }
        catch (IllegalStateException linkingError){
            System.out.println("Getting exception");
            linkingError.printStackTrace();
        }
        finally {
            System.out.println("Executing finally");
            if (connection != null){
                connection.unlink();
            }
        } */
    }
}
