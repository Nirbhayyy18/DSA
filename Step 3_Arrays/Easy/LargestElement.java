import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        // Brute Force (Time = O(N log N))
         int[] arr = {2, 5, 1, 3, 0};
         Arrays.sort(arr);
         System.out.println(arr[arr.length-1]);

        
        // Optimal (Time = O(N))
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);

    }
}
