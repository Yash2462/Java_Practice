public class Nums  {
    public static void main(String[] args) {
      int a = 10 ;
      int b = 0 ;

       try {
           int c = a / b ;
       }catch (Exception e){
           // it Throws Divide by zero Exception
           e.printStackTrace();
       }

    }
}
