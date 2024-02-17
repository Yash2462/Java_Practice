public class WordNest {
    public static int wordNest(String word, String nest) {
        int word_len = word.length();
        int nest_len = nest.length();

       int count = nest_len/word_len -1;

     return count;
    }

    public static void main(String[] args) {

        System.out.println( "Total nest is :"+wordNest("floor", "floor"));
        System.out.println("Total nest is :"+wordNest("code", "cocodccococodededeodeede"));
        System.out.println("Total nest is :"+wordNest("incredible", "increinincrincredibleediblecredibledible"));
        System.out.println("Total nest is :"+wordNest("engagement", "engenengagemengagemeengagementntentgagementagement"));
        System.out.println( "Total nest is :"+wordNest("passage", "passpassageage"));
    }
}
