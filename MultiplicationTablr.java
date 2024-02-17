public class MultiplicationTablr {
    static void MultiplicationTable(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + " * " +i + " = "+n*i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable(5);
    }
}
