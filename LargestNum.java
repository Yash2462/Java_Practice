public class LargestNum {

    static int largest(int a , int b){
        if (a > b){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(largest(50,7));
    }
}
