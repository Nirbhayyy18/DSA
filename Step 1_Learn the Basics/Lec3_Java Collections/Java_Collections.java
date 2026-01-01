
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Java_Collections {
    public static void main(String[] args) {

        // List: 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Display By Index
        System.out.println(list.get(0));
        
        // Display All Elements
        for(int arr:list)
            {
                System.out.println(arr);
            }


        // Set: 

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set);

        for(int arr: set)
            {
                System.out.println(arr);
            }


        // Map
        
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('B', 1);
        map.put('C', 2);

        System.out.println(map);

        for(Map.Entry<Character,Integer> e: map.entrySet())
            {
                System.out.println(e.getKey()+"="+e.getValue());
            }
    }

}
