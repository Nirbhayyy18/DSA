import java.util.*;
public class Print_All_divisorOptimal {
    public static void alldivisor(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                    {
                        list.add(i);
                    if(n/i != i)
                        {
                            list.add(n/i);
                        }
                    }
            }
           Collections.sort(list);
           System.out.println(list);
    }
    public static void main(String[] args) {
        alldivisor(36);
        alldivisor(12);
        alldivisor(9);

    }
}
