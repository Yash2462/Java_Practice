public class BrickFitOrNot {
     // (a,b,c) -- dimensions of the brick
    // (w,h) -- dimensions of the hole

    // solution : there are mainly three conditions in which any one is false then brick doesn't fit into the hole
    public static boolean doesBrickFit(int a, int b, int c,  int w, int h) {
         // solution:
        // here two conditions for brickFitOrNot
        // First condition checks if width and depth is less or equal to width
        // and second condition checks for height of brick less or equal to height of hole
        // or condition is same but with swapping width and height of hole

        if (((b <=w  || c<=w) && a<=h) || ((b<=h || c <=h) && a<=w)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(doesBrickFit(1,2,2, 2,1));
    }
}
