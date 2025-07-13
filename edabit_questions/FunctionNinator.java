package edabit_questions;

public class FunctionNinator {
    public static String inatorInator(String inv) {
       char ch = inv.charAt(inv.length()-1);
        String ans;
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            ans = inv+"-inator"+" "+inv.length()+"000";
       }
       else {
          ans = inv+"inator";
       }
         return ans;
    }

    public static void main(String[] args) {
        System.out.println(inatorInator("EvilClone"));
    }
}
