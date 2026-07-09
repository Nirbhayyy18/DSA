public class SecondSmallest {
    public static void main(String[] args) {
         int[] arr = {1, 3, 4, 7, 7, 2};
         int Smallest = arr[0];
         int SecondSmallest = Integer.MAX_VALUE;
         for(int i=1;i<arr.length;i++)
         {
            if(arr[i]<Smallest)
            {
                SecondSmallest = Smallest;
                Smallest = arr[i];
            }
            if(arr[i]<SecondSmallest && arr[i]!=Smallest)
            {
                SecondSmallest = arr[i];
            }
         }
         System.out.println(Smallest);
         System.out.println(SecondSmallest);
    }
}
