public class Maximum_SubArray_Sum
{
    public static void main(String[] args) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int[] arr = {1, -2, 3, 4, -5};
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>maxi)
            {
                maxi = sum;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(maxi);
    }
}