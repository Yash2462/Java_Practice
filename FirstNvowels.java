// question : find first n vowels
// solution : convert string to charArray and iterate for loop and check for condition isVowel if
// it is true then increase count and make another condition if count == n then return string ans

public class FirstNvowels {
    public static String firstNVowels(String str, int n) {
          int count = 0;
          char[] ch = str.toCharArray();
          String ans = "";

        for (int i = 0; i <ch.length ; i++) {
            if ( isVowel(ch[i]) ){
                ans += ch[i];
                count++;

                if (count == n){
                    return ans;
                }
            }

        }
        return "invalid";
    }

    private static boolean isVowel(char i) {
        if (i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstNVowels("sharpening skills", 3));
        System.out.println(firstNVowels("major league", 5));
        System.out.println(firstNVowels("hostess", 5));
    }
}
