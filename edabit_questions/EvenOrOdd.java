package edabit_questions;

public class EvenOrOdd {
    static void isEvenOdd(int num){
        if (num % 2 == 0){
            System.out.println("Entered umber is even");
        }
        else {
            System.out.println("Entered number is odd");
        }
    }

    public static void main(String[] args) {
        isEvenOdd(4);
    }
}
