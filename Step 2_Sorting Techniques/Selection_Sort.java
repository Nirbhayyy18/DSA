public class Selection_Sort {
    public static void main(String[] args) {
        int a[] = {2,4,6,3,1,8};
        for(int i=0;i<a.length-1;i++)
            {
                int minPos = i;
                for(int j=i+1;j<a.length;j++)
                    {
                        if(a[minPos]>a[j])
                            {
                                minPos = j;
                            }
                    }
                    int temp = a[minPos];
                    a[minPos] = a[i];
                    a[i] = temp;
            }
            for(int i=0;i<a.length;i++) 
                {
                    System.out.println(a[i]);
                }
            
    }    
}
