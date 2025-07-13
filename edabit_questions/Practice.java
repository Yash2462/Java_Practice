package edabit_questions;//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

public class Practice {

    public static void main(String[] args) {
        int days_august = 31;
        int count = 0;

        for (int i = 0; i <= days_august ; i++) {
            if (i % 2 == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
