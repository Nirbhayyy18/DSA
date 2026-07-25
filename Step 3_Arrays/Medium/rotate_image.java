public class rotate_image {
   public static void main(String[] args) {

    // Brute Force
    // int[][] mat = {
    //         {1, 2, 3},
    //         {4, 5, 6},
    //         {7, 8, 9}
    //     };
    
    // int n = mat.length;
    // int rotated[][] = new int[n][n];

    // for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<n;j++)
    //     {
    //         rotated[j][n-i-1] = mat[i][j]; 
    //     }
    // }

    // for (int[] row : rotated) {
    //         for (int val : row)
    //             System.out.print(val + " ");
    //         System.out.println();
    //     }

    // Optimal
    int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
    int n = mat.length;

    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
    }

       // Reverse
        
       
            for(int i=0;i<n;i++)
            {
                int start = 0, end = n-1;
                 while(start<end)
            {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
            } 
        
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
   } 
}
