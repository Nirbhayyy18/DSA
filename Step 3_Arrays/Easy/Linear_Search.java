public class Linear_Search {
    public static void main(String[] args) {
         int arr[] = {1, 2, 3, 4, 5};
         int num = 4;
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==num)
            {
                System.out.println(num+" found on index "+i);
                break;
            }
         }
    }
}
