public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
      int sum = 0;
      int max = Integer.MIN_VALUE;

        for (int i = 0; i <accounts.length ; i++) {
            for (int j = 0; j <accounts[i].length ; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max,sum);
            sum =0;
        }

        return max;
    }

    public static void main(String[] args) {
        RichestCustomerWealth rw = new RichestCustomerWealth();
       int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println( "Maximum wealth customer has :"+rw.maximumWealth(accounts));
    }
}
