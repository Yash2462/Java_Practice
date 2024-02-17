public class MagicDate {
    public static boolean magic(String str) {
      String[] arr = str.split(" ");
      int month = Integer.parseInt(arr[0]);
      int date = Integer.parseInt(arr[1]);
      String year = arr[2];

      int multiplication = month * date;
      int count = countDigits(multiplication);

      switch (count){

          case 1: if (multiplication == Integer.parseInt((year.substring(year.length()-1, year.length())))){
              return true;
          }
          else {
              return false;
          }
          case 2: if (multiplication == Integer.parseInt((year.substring(year.length()-2, year.length())))){
              return true;
          }
          else {
              return false;
          }

          case 3: if (multiplication == Integer.parseInt((year.substring(year.length()-3, year.length())))){
              return true;
          }
          else {
              return false;
          }
      }
      return false;
    }

    private static int countDigits(int multiplication) {
        int count = 0;

        while (multiplication >0){
            count++;
            multiplication /= 10;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(magic("1 1 2011"));
        System.out.println(magic("4 1 2001"));
        System.out.println(magic("5 2 2010"));
        System.out.println(magic("9 2 2011"));
    }
}
