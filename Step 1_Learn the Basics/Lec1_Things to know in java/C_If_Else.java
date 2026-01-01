
import java.util.Scanner;

public class C_If_Else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Age: ");
        int age = sc.nextInt();
        if(age>=18)
            {
                System.out.println("You are eligible for vote");
            }
            else{
                System.out.println("You are not eligible for vote");
            }
    }
}