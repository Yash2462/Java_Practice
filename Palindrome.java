public class Palindrome {

    static boolean isPalindrome(String s){
        String a ="";
        char[] ch = s.toCharArray();

        for (int i =s.length()-1; i >= 0 ; i--) {
            a = a+ch[i];
        }

        if (s.equalsIgnoreCase(a)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Naman"));
    }
}
