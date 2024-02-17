// question : Transcribe the given DNA strand into corresponding mRNA - a type of RNA,
// that will be formed from DNA after transcription.
// DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
// approach : convert string into charArray and iterate for loop and change chars using conditions
// and iterate another for loop for store it in a string and return it

public class DnaToRna {
    public static String dnaToRna(String strand) {
          char[] ch = strand.toCharArray();
        for (int i = 0; i <strand.length() ; i++) {
            if (ch[i] == 'A'){
                ch[i] = 'U';
            }
            else if (ch[i] == 'T') {
               ch[i] = 'A';
            }
            else if (ch[i] == 'G') {
              ch[i] ='C';
            }
            else {
                ch[i] = 'G';
            }
        }
        String ans = "";
        for (int i = 0; i <ch.length ; i++) {
            ans += ch[i];
        }
         return ans;
    }

    public static void main(String[] args) {
        System.out.println(dnaToRna("GTCATACGACGTA"));
    }
}
