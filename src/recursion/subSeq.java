package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class subSeq
{
    public static void main(String[] args) {
//        subseq("","abc");
        System.out.println(subseqList("","abc"));
    }

    static ArrayList<String> subseqList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqList(p+ch, up.substring(1));
        ArrayList<String> right = subseqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
