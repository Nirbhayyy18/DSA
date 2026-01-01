
import java.util.ArrayList;
import java.util.Collections;

public class Find_GCD_Brute {
    public static void main(String[] args) {
        int N1 = 20;
        int N2 = 15;
        ArrayList<Integer> l1 = new ArrayList<>(); 
        ArrayList<Integer> l2 = new ArrayList<>(); 
        ArrayList<Integer> l3 = new ArrayList<>(); 
        for(int i=1;i<=Math.sqrt(N1);i++)
            {
                if(N1%i==0)
                    {
                        l1.add(i);

                if(N1/i != i)
                    {
                        l1.add(N1/i);
                    }
                }
            }
            for(int i=1;i<=Math.sqrt(N2);i++)
                {
                    if(N2%i==0)
                        {
                            l2.add(i);
                    if(N2/i != i)
                        {
                            l2.add(N2/i);
                        }
                    }
                }

            for(var a: l1)
                {
                    if(l2.contains(a))
                        {
                            l3.add(a);
                        }
                }

            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);
            int gcd = Collections.max(l3);
            System.out.println(gcd);
    }
}
