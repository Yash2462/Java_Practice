public class ReverseGivenString {
    public static String reverse(String str) {
      char[] ch = str.toCharArray();
        String ans = "";
        for (int i = ch.length-1; i >=0 ; i--) {
            ans += ch[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        String a = "World";
        String b = "hello";

        System.out.println(reverse(a));
        System.out.println(reverse(b));
    }
}
