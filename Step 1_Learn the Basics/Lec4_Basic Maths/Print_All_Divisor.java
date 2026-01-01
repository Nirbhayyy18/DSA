import java.util.*;
public class Print_All_Divisor {
    public static void alldivisor(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    {
                        list.add(i);
                    }
            }
            System.out.println(list);
    }
    public static void main(String[] args) {
        alldivisor(36);
        alldivisor(12);

    }
}
