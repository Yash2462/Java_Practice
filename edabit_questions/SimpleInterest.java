package edabit_questions;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
public class SimpleInterest {
    static double simpleInterest(double p, double t , double R){
        double r = R/100;
        double simpleinterest = p * ( 1 + (r * t));

        return simpleinterest;
    }

    public static void main(String[] args) {
        System.out.println(simpleInterest(3000000,12,1.5));
    }
}
