public class H_Inverted_Star_Pyramid {
    public static void main(String[] args) {
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
