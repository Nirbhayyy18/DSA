public class ArmStrongNo {
    public static void main(String[] args) {
        int N = 1634;
        int original = N;
        int rem;
        double sum=0;
        int count =(int) Math.log10(N)+1;
        while(N>0)
            {
                rem = N%10;
                sum = sum+Math.pow(rem, count);
                N = N/10;
            }
        
            System.out.println(count);
            System.out.println((int)sum);
            if((int)sum==original)
            {
                System.out.println("True");
            } 
            else{
                System.out.println("False");
            }
    }
}
