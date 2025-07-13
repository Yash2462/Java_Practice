package edabit_questions;

public class SumOfNnums {

    static int sum(int n){
        // this is called base condition
        if (n == 0){
            return 0;
        }
        // this is called recursion when function calls itself
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
