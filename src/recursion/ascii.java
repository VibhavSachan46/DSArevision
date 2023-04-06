package recursion;

public class ascii
{
    public static void main(String[] args) {
//        char ch = 'a';
//        System.out.println(ch+0);

        Ascii("","abc");
    }

    static void Ascii(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);
//        Ascii(p+ch, up.substring(1));
        Ascii(p + (ch+0), up.substring(1));
        Ascii(p, up.substring(1));
    }
}
