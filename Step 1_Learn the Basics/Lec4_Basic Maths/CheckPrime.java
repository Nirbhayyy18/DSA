import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber: ");
        int N = sc.nextInt();
        int count = 0;

        // Brute Force Approach

        // for(int i=1;i<=N;i++)
        //     {
        //         if(N%i==0)
        //             {
        //                 count++;
        //             }
        //     }
        //     if(count==2) System.out.println("Given Number is Prime");
        //     else System.out.println("Given Number is Not Prime");

        // Optimal Approach

        for(int i=1;i<=Math.sqrt(N);i++)
            {
                if(N%i==0)
                    {
                        count++;
                    }
            }
            if(count==1) System.out.println("Given Number is Prime");
            else System.out.println("Given Number is Not Prime");

    }
}
