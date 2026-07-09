import java.util.HashMap;

public class A_Two_Sum
{
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11},target = 17;

        // Optimal
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int a=0;a<arr.length;a++)
        {
            int element = target - arr[a];
            if(hm.containsKey(element))
            {
                System.out.println(a+" "+hm.get(element));
                break;
            }
            hm.put(arr[a], a);
        }
    }
}