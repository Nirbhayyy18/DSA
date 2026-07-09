public class Set_Matrix_Zeros
{
    public static void main(String[] args) {
        
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;

        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(matrix[i][j]==0)
        //         {
        //             for(int col = 0;col<n;col++)
        //             {
        //                 if(matrix[i][col]!=0)
        //                 {
        //                     matrix[i][col] = -1;
        //                 }
        //             }

        //             for(int row = 0;row<m;row++)
        //             {
        //                 if(matrix[row][j]!=0)
        //                 {
        //                     matrix[row][j] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }

        // for(int i=0;i<m;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         if(matrix[i][j]==-1)
        //         {
        //             matrix[i][j]=0;
        //         }
        //     }
        // }
       
        // for(int row[]:matrix)
        // {
        //     for(int val : row)
        //     {
        //         System.out.print(val+" ");
        //     }
        //     System.out.println();
        // }


        // Optimal

         boolean firstrowzero = false;
        boolean firstcolzero = false;

        for(int j=0;j<n;j++)
        {
            if(matrix[0][j]==0)
            {
                firstrowzero = true;
                break;
            }
        }

        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                firstcolzero = true;
                break;
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if( matrix[i][0] == 0 || matrix[0][j] == 0)
                {
                    matrix[i][j]=0;
                }
            }
        }

        if(firstrowzero)
        {
            for(int j=0;j<n;j++)
            {
                matrix[0][j]=0;
            }
        }
        if(firstcolzero)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][0]=0;
            }
        }

         for(int row[]:matrix)
        {
            for(int val : row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}