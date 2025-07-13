package edabit_questions;// Question : Suppose that you add all of the page numbers in a book.
// If the total is 21, the book could only have 6 pages because 1 + 2 + 3 + 4 + 5 + 6 = 21.
// If I had said the total were 25,
// that would be impossible because the next number in the series is 28 (21 + 7).
// solution : declare a variable sum =0 iterate for loop for 1 to total sum all the elements
// if sum == total then true else false

public class PagesInBook {
    public static boolean pagesInBook(int total) {
          int sum = 0;

        for (int i = 1; i <total ; i++) {
            sum = sum +i;
            if (sum == total){
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args) {
        System.out.println(pagesInBook(9453));
    }
}
