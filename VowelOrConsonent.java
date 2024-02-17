public class VowelOrConsonent {

    public static String split(String str) {
          String vowels ="";
          String others = "";

        for (int i = 0; i <str.length() ; i++) {
            if (isVowel(str.charAt(i))){
                vowels = vowels + str.charAt(i);
            }
            else{
                others = others + str.charAt(i);
            }
        }
        String ans = vowels + others;

        return ans;
    }

    private static boolean isVowel(char i) {
        if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(split("abcde") );
        System.out.println(split("Hello!"));
        System.out.println(split("What's the time?"));
    }
}
