package recursion;

import java.util.ArrayList;

public class noofDigits
{
    public static void main(String[] args) {
//        number("",4);
        System.out.println(diceList("",4));
    }

    static ArrayList<String> diceList(String p, int up)
    {
        if(up == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i<=up; i++) {
            ans.addAll(diceList(p+i, up-i));
        }
        return ans;
    }


    static void number(String p, int up)
    {
        if(up == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i<=up; i++) {
            number(p+i, up-i);
        }
    }
}
