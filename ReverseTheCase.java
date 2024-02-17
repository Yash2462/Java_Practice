public class ReverseTheCase {
    public static String reverseCase(String str) {
       char[] ch =str.toCharArray();
       String ans ="";
        for (int i = 0; i <ch.length ; i++) {

            if (ch[i] >=65 && ch[i]<=90 ){
                 ans = str.toLowerCase();

//                str.replace(str.charAt(i) ,ans.charAt(i));
            }
            else {
//                System.out.println("is in lowercase");
                 ans = str.toUpperCase();
//                str.replace(str.charAt(i) ,ans.charAt(i));
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String a = "ABc";
        System.out.println(reverseCase(a));
    }
}
