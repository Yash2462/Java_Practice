package edabit_questions;// Question : Identify min and max value from string
// Solution : split given string by " " space and store it into string array
// iterate loop and check for min and max values
// return string by concatenating min and max values

public class ReturnHighestAndLowest {
    public static String highLow(String s) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      String[] ch = s.split(" ");
        for(int i = 0; i <ch.length ; i++) {
            if (Integer.parseInt(ch[i]) > max){
                max = Integer.parseInt(ch[i]);
            }
            if (Integer.parseInt(ch[i]) < min){
                min = Integer.parseInt(ch[i]);
            }
        }
       ;

        return  max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highLow("13"));

        System.out.println(highLow("1 2 -3 4 5"));
        System.out.println(highLow("1 9 3 4 -5"));

    }
}
