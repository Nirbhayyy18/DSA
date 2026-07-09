import java.util.ArrayList;
import java.util.List;

public class Union_of_Sorted_array {
    public static void main(String[] args) {
        // Using Set(Not optimal)

    /*/
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        HashSet<Integer> s = new LinkedHashSet<>();
        for(int x: arr1)
        {
            s.add(x);
        }
        for(int y: arr2)
        {
            s.add(y);
        }

        System.out.println(s);
    */

        // Using Two Pointer (Optimal Approach)

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length;
        int m = arr2.length;

        int i=0;
        int j=0;

        List<Integer> Union = new ArrayList<>();
        
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                  if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;  // Move pointer in arr1
            }
            else if(arr1[i]>arr2[j])
            {
                 if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;  // Move pointer in arr2
            }
            
            else
            {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;  // Move both pointers
            }

        }

        while(i<n)
        {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        while(j<m)
        {
             if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        for(int x: Union)
        {
            System.out.println(x);
        }

    }
}
