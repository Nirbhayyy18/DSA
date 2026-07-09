public class B_Sort_Colors {
    public static void main(String[] args) {
        int nums[] = {1, 0, 2, 1, 0};
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<k)
        {
            if(nums[j]==1)
            {
                j++;
            }
            else if(nums[j]==2)
            {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                k--;
            }
            else 
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
                j++;
            }
        }

        for(int a=0;a<nums.length;a++)
        {
            System.out.print(nums[a]+", ");
        }

    }
}
