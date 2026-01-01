public class J_Half_Diamond_Star_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
            }
        for(int p=0;p<n-1;p++)
            {
                for(int q=n-1;q>p;q--)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
            }
    }
}
