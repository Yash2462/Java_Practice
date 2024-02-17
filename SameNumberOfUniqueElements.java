public class SameNumberOfUniqueElements {
    public static boolean same(int[] a1, int[] a2) {
       int count1 = 0;
       int count2 = 0;
        for (int i = 0; i < a1.length ; i++) {
            for (int j = i+1; j < a1.length ; j++) {
                if (a1[i] != a1[j]){
                    count1++;

                }
                break;
            }
        }

        for (int i = 0; i < a2.length ; i++) {
            for (int j = i+1; j < a2.length ; j++) {
                if (a1[i] != a1[j]){
                    count2++;
                }
            }
            break;
        }

        if (count1 == count2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
      int[] arr1 = {1, 3, 4, 4, 4};
      int[] arr2 = {2, 5, 7};

        System.out.println(same(arr1,arr2));
    }
}
