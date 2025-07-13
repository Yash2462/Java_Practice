package edabit_questions;// problem : replace chars of string to the next char
// solution : convert string to char array and create new array with length of string
// declare local variable a and assign char value + 1 to the a and after that assign value a by typecasting to char
// at last create string from char array


public class MoveChars {
    public static String move(String word) {
     char[] ch =word.toCharArray();
     char[] ans = new char[ch.length];

        for (int i = 0; i <ch.length ; i++) {
            int a = ch[i]+1;
            ans[i] = (char) a;
        }
        String as ="";
        for (int i = 0; i <ans.length ; i++) {
            as += ans[i];
        }

        return as;
    }

    public static void main(String[] args) {

        System.out.println(move("welcome"));
    }
}
