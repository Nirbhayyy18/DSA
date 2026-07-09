public class Merge_Sort {

    public static void main(String[] args) {

        // Input array
        int a[] = {2, 4, 6, 3, 1, 8,0};

        // Start merge sort on the whole array
        mergeSort(a, 0, a.length - 1);

        // Print the sorted array
        for (int x : a) {
            System.out.println(x);
        }
    }

    // This function divides the array into smaller parts
    // and sorts them recursively+
    static void mergeSort(int arr[], int l, int r) {

        // If the current part has more than one element,
        // then only it needs sorting
        if (l < r) {

            // Find the middle safely
            int mid = (l+r)/2;

            // Sort left half
            mergeSort(arr, l, mid);

            // Sort right half
            mergeSort(arr, mid + 1, r);

            // Merge the two sorted halves
            mergeFun(arr, l, mid, r);
        }
    }

    // This function merges two sorted subarrays:
    // arr[l...mid] and arr[mid+1...r]
    static void mergeFun(int arr[], int l, int mid, int r) {

        // Sizes of the two subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Temporary arrays to hold data
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        // Copy data into Left and Right arrays
        int kk = l;

        for (int i = 0; i < n1; i++) {
            Left[i] = arr[kk++];
        }

        for (int j = 0; j < n2; j++) {
            Right[j] = arr[kk++];
        }

        // Merge pointers:
        // i → Left array
        // j → Right array
        // k → original array
        int i = 0, j = 0, k = l;

        // Compare elements and merge them in sorted order
        while (i < n1 && j < n2) {

            // Pick the smaller element and place it in original array
            if (Left[i] > Right[j]) {
                arr[k++] = Right[j++];
            } else {
                arr[k++] = Left[i++];
            }
        }

        // Copy remaining elements of Left[] if any
        while (i < n1) {
            arr[k++] = Left[i++];
        }

        // Copy remaining elements of Right[] if any
        while (j < n2) {
            arr[k++] = Right[j++];
        }
    }
}
