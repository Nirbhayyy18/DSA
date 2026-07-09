public class next_permutation {
    public static void main(String[] args) {
       int  nums[] = {1,2,3};
       int Gola_index = -1;

       // find Blue Gola_index
       for(int i=nums.length-1;i>0;i--)
       {
            if(nums[i]>nums[i-1])
            {
                Gola_index = i-1;
                break;
            }
       }
        if (Gola_index == -1) {
            // Reverse the entire array
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Find Just Larger index
        for(int i=nums.length-1;i>Gola_index;i--)
        {
            if(nums[i]>nums[Gola_index])
            {
                swap(nums, i, Gola_index);
            }
        }

        // reverse Part After Gola_Index
        reverse(nums, Gola_index+1, nums.length-1);


        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int arr[], int start, int end)
        {
            while(start<end)
            {
                swap(arr, start, end);
                    start++;
                    end--;
            }
        }

    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;  
    }
}
