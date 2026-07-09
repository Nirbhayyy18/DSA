public class Rotate_By_K_elements {
    public static void main(String[] args) {
        // Right Rotate by K Elements
        // Brute Force Approach
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int temp[] = new int[k];
        int n = nums.length;
        int a=0;
        for(int i=n-k;i<n;i++)
        {
            temp[a] = nums[i];
            a = a+1;
        }

        for(int i = n-k-1;i>=0;i--)
        {
            nums[i+k] = nums[i];
        }

        for(int i=0;i<k;i++)
        {
            nums[i] = temp[i];
        }
        for(int x:nums)
        {
            System.out.println(x);
        }
    }
}
