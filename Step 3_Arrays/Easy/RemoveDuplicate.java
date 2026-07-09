public class RemoveDuplicate {
    public static void main(String[] args) {

        // Using Set (Not Optimal)
        /*
        int[] nums = {0,0,1,1,1,2,2,3,3,4};  
        Set<Integer> s = new LinkedHashSet<>();

        for(int x : nums)
        {
            s.add(x);
        }

        int n=0;
        for(int a:s)
        {
            nums[n++] = a;
        }

        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        } 

        */

        // Using Two Pointer (Optimal)

        int[] nums = {0,0,1,1,1,2,2,3,3,4};  
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
       for(int a=0;a<i;a++)
       {
        System.out.println(nums[a]);
       }
    }
}
