import java.util.HashMap;

public class Count_FrequencyOf_Element {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(var a: arr)
            {
                map.put(a, map.getOrDefault(a, 0)+1);
            }
        
            System.out.println(map);
    }
}
