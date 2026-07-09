public class Recusive_BubbleSort {

    static void bubbleSort(int arr[], int n)
    {
        // Base Case
        if(n==1) return;

        boolean swapped = false;

        for(int i=0;i<=n-2;i++)
            {
                if(arr[i]>arr[i+1])
                    {
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        swapped = true;
                    }
            }

        // Return if array already sorted (O(1) Time Complexity for best case(Sorted Array))
        if(!swapped) return;

        bubbleSort(arr, n-1);

    }
    public static void main(String[] args) {

        int arr[] = {2,5,3,7,1};
        bubbleSort(arr, arr.length);

        for(int x: arr)
            {
                System.out.println(x);
            }
    }
}
