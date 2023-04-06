package recursion;

import java.util.ArrayList;

public class permutation
{
    public static void main(String[] args) {
//        perm("","abc");

        System.out.println(Countpermutation("","abcde"));
    }

    static int Countpermutation(String p, String up)
    {
        if(up.isEmpty())
        {
//            System.out.println(p);
            return 1;
        }

        int c=0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            c = c + Countpermutation(first + ch + second , up.substring(1));
        }
        return c;
    }

    static ArrayList<String> permList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            ans.addAll(permList(first + ch + second , up.substring(1)));
        }

        return ans;
    }

    static void perm(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            perm(first + ch + second , up.substring(1));
        }
    }
}
