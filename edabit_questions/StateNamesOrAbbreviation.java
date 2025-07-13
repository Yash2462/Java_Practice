package edabit_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateNamesOrAbbreviation {

    public static String[] filterStateNames(String[] arr, String type) {

        List<String> abb = new ArrayList<>();
        List<String> full = new ArrayList<>();
           for (int i = 0; i <arr.length ; i++) {
               String ch = arr[i];
               for (int j = 0; j <ch.length() ; j++) {
                   if ((int)ch.charAt(1) >97){
                       abb.add(ch);
                   }
                   else {
                      full.add(ch);
                   }
               }
           }
           if (type.equals("abb")){
               String[] ans = new String[abb.size()];

               for (int i = 0; i < ans.length ; i++) {
                   ans[i] = abb.get(i);
               }

               return ans;
           }
           String[] ans2 = new String[full.size()];

        for (int i = 0; i <ans2.length ; i++) {
            ans2[i] = full.get(i);
        }

        return ans2;
    }

    public static void main(String[] args) {
    String[] arr = {"Arizona", "CA", "NY", "Nevada"};
    String type = "abb";
        System.out.println(Arrays.toString(filterStateNames(arr,type)));
    }
}
