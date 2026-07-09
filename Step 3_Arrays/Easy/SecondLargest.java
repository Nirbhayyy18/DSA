public class SecondLargest {
    public static void main(String[] args) {

        // brute Force (N log N + N)
        /* 
          int[] arr = {1, 2, 4, 7, 7, 5};
          Arrays.sort(arr);
          int Largest = arr[arr.length-1];
          for(int i=arr.length-2;i>=0;i--)
          {
                if(arr[i]<Largest)
                {
                    System.out.println(arr[i]);
                    break;
                }
          }

        */

        // Better Approach

        /* 

         int[] arr = {1, 2, 4, 7, 7, 6};
         int Largest = arr[0];
          for(int i=1;i<arr.length;i++)
          {
            if(arr[i]>Largest)
                Largest = arr[i];
          }

          int SecondL = -1;
          for(int i=0;i<arr.length;i++)
          {
            if(arr[i]>SecondL && arr[i]!=Largest)
            {
                SecondL = arr[i];
            }
          }
          System.out.println(SecondL);

        */

        // Optimal
         int[] arr = {1, 2, 4, 7, 7, 6};
         int Largest = arr[0];
         int SecondL = -1;
         for(int i=1;i<arr.length;i++)
         {
            if(arr[i]>Largest)
            {
                SecondL = Largest;
                Largest = arr[i];
            }
            else if(arr[i]>SecondL && arr[i]<Largest)
            {
                SecondL = arr[i];
            }
         }
         System.out.println(SecondL);
    }
}
