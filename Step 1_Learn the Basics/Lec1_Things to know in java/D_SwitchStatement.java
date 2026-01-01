
import java.util.Scanner;

public class D_SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char c = sc.next().charAt(0);

        switch(c)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered Character is Vowel");
                break;
                default:
                    {
                        System.out.println("Entered character is Not Vowel");
                    }
        }

    }
}
