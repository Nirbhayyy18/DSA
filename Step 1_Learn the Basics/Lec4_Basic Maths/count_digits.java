import java.util.*;

public class count_digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int N = sc.nextInt();

        // Brute Force Approach
        // int count = 0;
        // while(N>0)
        //     {
        //         count++;
        //         N = N/10;
        //     }
        //     System.out.println("Given Number has Total "+count+" Digits");


        // Optimal Approach
        int cnt = (int) Math.log10(N) + 1;
        System.out.println("Given Number has Total "+cnt+" Digits");

    }
}
