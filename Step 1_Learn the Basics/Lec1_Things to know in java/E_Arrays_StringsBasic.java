public class E_Arrays_StringsBasic {
    public static void main(String[] args) {
        // Array :
        // - Array Index Start with Zero

        // Creation of Array
        //1: 
        int a[] = new int[10];
        
        //2:
        int numbers[] = {1,2,3,4,5};

        //3:
        String Fruites[] = {"A","B","C"};

        System.out.println(Fruites[0]);

        // String :
        // - Strings are like a series of characters stored in a specific order
        // - Each character in a string is assigned an index, starting from 0
        // - This means the first character is at index 0, the second character at index 1, and so on.

        String s = "Nirbhay";
        System.out.println(s);

        // Length of string
        System.out.println("length of 'Nirbhay' is: "+s.length());

        // Accessing Particular Character from String using charAt(index)
        System.out.println("First Letter of 'Nirbhay' is: "+s.charAt(0));
    }
}
