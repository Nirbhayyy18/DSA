public class RotateArray {
    public static void main(String[] args) {
        // Left Rotate by One:
        // Brute Force
    /*
         int[] arr = {1, 2, 3, 4, 5};
         int arr2[] = new int[arr.length];
         int n=0;
         for(int i =1;i<arr.length;i++)
         {
            arr2[n++] = arr[i]; 
         }
         arr2[arr.length-1] = arr[0];
         for(int x:arr2)
         {
            System.out.println(x);
         }

    */
         // Optimal

         int[] arr = {1, 2, 3, 4, 5};
         int temp = arr[0];
         for(int i=1;i<arr.length;i++)
         {
            arr[i-1] = arr[i];
         }
         arr[arr.length-1] = temp;
         for(int x:arr)
         {
            System.out.println(x);
         }
    }
}
