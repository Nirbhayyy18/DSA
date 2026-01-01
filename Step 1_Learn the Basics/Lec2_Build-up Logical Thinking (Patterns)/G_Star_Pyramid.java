/*
In this pattern, we form a pyramid of stars. Each row contains:

(N - i - 1) spaces on the left (to center align the stars),
(2 * i + 1) stars in the middle,
(N - i - 1) spaces on the right.

*/


public class G_Star_Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
            {
                //Space
                for(int j=0;j<n-i-1;j++)
                    {
                        System.out.print(" ");
                    }
                
                // Star
                for(int k=0;k<2*i+1;k++)
                    {
                        System.out.print("*");
                    }

                // space
                for(int m=0;m<n-i-1;m++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println();
            }
    }
}
