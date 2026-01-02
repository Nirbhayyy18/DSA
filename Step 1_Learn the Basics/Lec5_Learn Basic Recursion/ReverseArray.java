public class ReverseArray {

    public static void reverseArray(int n[],int cnt)
    {
        if(cnt==n.length)
            {
                return;
            }
        reverseArray(n, cnt+1);
        System.out.println(n[cnt]);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int cnt=0;
        reverseArray(a, cnt); 
    }
}
