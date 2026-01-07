public class Insertion_Sort {
    public static void main(String[] args) {
        int a[] = {2,4,6,3,1,8};
        int n=a.length;
        int j,temp;

        for(int i=1;i<n;i++) 
            { 
            temp=a[i]; 
                for(j=i-1;j>=0 && a[j]>temp;j--) 
                { 
                    a[j+1]=a[j]; 
                } 
                a[j+1]=temp; 
            } 

            for(int i=0;i<a.length;i++) 
                {
                    System.out.println(a[i]);
                }
    }
}
