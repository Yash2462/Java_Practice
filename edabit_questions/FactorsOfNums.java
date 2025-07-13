package edabit_questions;

//Input a number and print all the factors of that number
public class FactorsOfNums {

    static void factors(int num){

        for (int i = 1; i <= num ; i++) {
            if (num % i == 0){
                System.out.println("Factors :" + i);
            }
        }
    }

    public static void main(String[] args) {
        factors(12);
    }
}
