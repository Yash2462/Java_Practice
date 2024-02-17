import java.util.*;

public class collections {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
      // used to add elements in list
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(60);

        System.out.println(l1);
       // we can set elements using set method
        l1.set(4,50);
        System.out.println(l1);
        // we can check if list contains element or not
        System.out.println(l1.contains(20));
    }

    }

