// checking string methods by using them
public class HashmapExample {
    public static void main(String[] args) {

        String name = "Yash";
//        String name2 = new String("Yash");

        for (int i = 0; i <name.length() ; i++) {
            System.out.println(name.charAt(i)); // using this method we can print string  chars
        }

        System.out.println(name.hashCode()); // used to return hashcode
        System.out.println(name.indexOf('s')); // used to return index of character 

//        if (name == name2){
//            System.out.println(" equal");
//        }
//        else {
//            System.out.println(" mot Equal");
//        }
//
//        if (name.equals(name2)){
//            System.out.println("equal using equals method");
//        }
//        else {
//            System.out.println("not equal using equals method");
//        }
    }
}
