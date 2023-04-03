package recursion;

public class reverse
{
//    static int sum=0;
    public static void main(String[] args) {
//        reverse(1245);
//        System.out.println(sum);

//        System.out.println(rev2(1245));
        int n= 1234321;
        rev2(n);
        System.out.println(palindrome(n));
    }


    static boolean palindrome(int n)
    {
        return (n==rev2(n));
    }

    static int rev2(int n)
    {
        int d = (int)(Math.log10(n))+1;
        return helper(n,d);
    }

    private static int helper(int n, int d) {
        if(n%10 == n)
        {
            return n;
        }

        int rem = n%10;
        return rem * (int)(Math.pow(10,d-1)) + helper(n/10,d-1);

    }

//    static void reverse(int n)
//    {
//        if(n%10 == 0)
//        {
//            return;
//        }
//        int rem = n%10;
//        sum = sum*10 + rem;
//        reverse(n/10);
//    }
}
