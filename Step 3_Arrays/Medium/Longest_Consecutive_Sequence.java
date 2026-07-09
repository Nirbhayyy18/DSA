import java.util.Arrays;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {

        // Brute Force

    //     int[] nums = {100, 4, 200, 1, 3, 2};
    //      if (nums.length == 0) {
    //         System.out.println(0);
    //     }
        
    //     int Longest = 1;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         int x = nums[i];
    //         int count=1;

    //         while(linearSearch(nums, x+1)==true)
    //         {
    //             x+=1;
    //             count+=1;
    //         }
    //         Longest = Math.max(Longest, count);
    //     }
    //     System.out.println(Longest);

    // }
    //  private static boolean linearSearch(int[] a, int num) {
    //     // Get length of the array
    //     int n = a.length;
    //     // Traverse through the array to check if the number exists
    //     for (int i = 0; i < n; i++) {
    //         // If element matches the number, return true
    //         if (a[i] == num)
    //             return true;
    //     }
    //     // Number not found
    //     return false;
    // }


    // Better Solution
    int[] nums = {100, 4, 200, 1, 3, 2};
         if (nums.length == 0) {
            System.out.println(0);
        }

        int Longest = 1;
        int count=0;
        
        Arrays.sort(nums);
        int Lastsmall = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1 == Lastsmall)
            {
                count+=1;
                Lastsmall = nums[i];
            }

            else if(nums[i] != Lastsmall)
            {
                count = 1;
                Lastsmall = nums[i];
            }
            Longest = Math.max(count, Longest);
        }
        System.out.println(Longest);

    }
}
