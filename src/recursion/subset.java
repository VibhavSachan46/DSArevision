package recursion;

public class subset
{
    public static void main(String[] args) {
//        remove("","bccaadd");

        System.out.println(remove2("","bccaadd"));
    }

    static String removeApple(String p,String up)
    {
        if(up.isEmpty())
        {
            return p;
        }

        char ch = up.charAt(0);

        if(ch!='a'){
            return removeApple(p + ch, up.substring(1));
        }
        else{
            return removeApple(p, up.substring(1));
        }
    }


    static String remove2(String p,String up)
    {
        if(up.isEmpty())
        {
            return p;
        }

        char ch = up.charAt(0);

        if(ch!='a'){
            return remove2(p + ch, up.substring(1));
        }
        else{
            return remove2(p, up.substring(1));
        }
    }
    static void remove(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch!='a'){
            remove(p + ch, up.substring(1));
        }
        else{
            remove(p, up.substring(1));
        }
    }
}
