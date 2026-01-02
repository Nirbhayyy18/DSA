public class Print_sum{

    public static int printSum(int n)
    {
        if(n==1) return 1;
        return n + printSum(n-1);
    }

    public static void main(String[] args) {
       int sum =  printSum(6);
       System.out.println(sum);
    }
}