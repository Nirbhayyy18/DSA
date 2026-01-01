public class B_DataTypes
{
    public static void main(String[] args) {
        // Non Decimal Numbers
        byte b = 127; // (Range = -128 to 127)
        short s = 11232; // (Range = -32768 to 32767)
        int i = 2345656; // (Range = -2.1B to 2.1B)
        long l = 384348755345345L; // (Huge Number) - Very Large
        
        // Decimal Numbers
        float f = 3.44f; // (6 Decimal Places)
        double d = 3.55555;// (15 Decimal Places)

        char c = 'A';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c);

    }
}