public class lengthOf_longest_subarray_with_given_sum {
    public static void main(String[] args) {
        int nums[] = {-3, 2, 1};
        int k=15;
        int maxlength = 0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum +=nums[j];
                if(sum==k)
                {
                    maxlength = Math.max(maxlength, j-i+1);  
                }
            }
        }
        System.out.println(maxlength);
    }
}
