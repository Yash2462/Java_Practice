// problem : Write a DECIMATOR function which takes a string and decimates it (i.e. it removes the last 1/10 of the characters).
//Always round off: if the string has 21 characters,
// 1/10 of the characters would be 2.1 characters,
// hence the DECIMATOR removes 3 characters. The DECIMATOR shows no mercy!

// Solution : declare ans String and make condition if length of string <=10 then length of string -1
// (else s.length - absolute value of length/10)-1;

public class TheDecimator {
    public static String decimator(String s) {
     String ans ="";
     int count ;
     if (s.length() <= 10){
         count = s.length()-1;
     }
     else  {
         count = (s.length() - Math.abs(s.length()/10))-1;
     }

        ans =s.substring(0,count);


        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decimator("1234567890"));
    }
}
