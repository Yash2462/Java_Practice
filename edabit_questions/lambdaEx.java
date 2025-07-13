package edabit_questions;

public class lambdaEx {

    public static void main(String[] args) {
   // we can use functional interfaces directly using lambda expressions
        add ad = (a, b) -> {

             return a+b;
         };

        int ans = ad.add(2,4);
        System.out.println(ans);
    }
interface add{
        int add(int a, int b);
}
}
