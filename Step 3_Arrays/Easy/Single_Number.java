import java.util.HashMap;

public class Single_Number {
    public static void main(String[] args) {
        int nums[] = {2,2,3,1,1,4,4};
        // Brute Force Approach
    /*
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==num)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println(nums[i]);
                break;
            }
        }
    */

        // Better Approach (Using HashMap)

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        
        for(int key: map.keySet())
        {
            if(map.get(key)==1)
            {
                System.out.println("Single Number: "+ key);
                break;
            }
        }
    }
}
