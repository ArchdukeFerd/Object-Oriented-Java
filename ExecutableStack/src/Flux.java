public class Flux {
        
        /** 
         * @param args
         */
        public static void main(String[] args) {
          System.out.println("Main start");
          try {
            Method1();
          } catch (Exception e) {
            e.printStackTrace();
          }
          System.out.println("Main end");
        }
        
        /** 
         * @throws MyException
         */
        private static void Method1() throws MyException{
          System.out.println("Method1 start");
          /* try{
            Method2();
          }
          catch(MyException me){
            System.out.println("Here's YOUR exception");
            me.printStackTrace();
          } */
          Method2();
          System.out.println("Mehtod1 end");
        }
        private static void Method2() throws MyException{
          System.out.println("Method2 start");
          throw new MyException("My exception was thrown");
          //throw new ArithmeticException();
          /* for(int i = 1; i <= 5; i++){
            System.out.println(i);
            try{
              if (i == 3){
                int num = 0;
                int result = i/num;
                System.out.println(result);
              }
              String test = null;
              System.out.println(test.toString());
            }
            catch (ArithmeticException | NullPointerException exception){
              System.out.println("Here's the exception");
              System.out.println(exception.getMessage());
              exception.printStackTrace();
            }
          } */
          //System.out.println("Method2 end");
        }
}
