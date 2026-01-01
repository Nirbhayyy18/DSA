class Check_Palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rem,rev=0;
        int original = x;
        while(x!=0)
        {
            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        return rev==original;
    }
    public static void main(String[] args) {
        boolean res = isPalindrome(121);
        System.out.println(res);
    }
}