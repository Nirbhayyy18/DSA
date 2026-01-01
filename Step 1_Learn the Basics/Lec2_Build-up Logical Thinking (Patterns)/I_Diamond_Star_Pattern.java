public class I_Diamond_Star_Pattern {
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
            for(int i=0;i<5;i++)
                {
                    for(int j=0;j<i;j++)
                        {
                            System.out.print(" ");
                        }
    
                    for(int p=0;p<2*5-(2*i+1);p++)
                        {
                            System.out.print("*");
                        }
                    
                    for(int j=0;j<i;j++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println();
                }
    }
}
