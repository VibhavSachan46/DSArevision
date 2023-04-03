package recursion;

import java.util.ArrayList;

public class sortedArray
{
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr= {1,2,6,3,4,5,6,14,6};
//        System.out.println(isSorted(arr,0));

//        findAllIndex(arr,0,6);
//        System.out.println(list);

        System.out.println(findAllIndexlist(arr,0,6,new ArrayList<>()));
    }

    static ArrayList<Integer> findAllIndexlist(int[] arr,int i,int t,ArrayList<Integer> list2)
    {
        if(i == arr.length) {
            return list2;
        }
        if(arr[i]==t) {
            list2.add(i);
        }
        return findAllIndexlist(arr,i+1,t,list2);

    }

    static void findAllIndex(int[] arr,int i,int t)
    {
        if(i == arr.length) {
            return;
        }
        if(arr[i]==t) {
            list.add(i);
        }
        findAllIndex(arr,i+1,t);

    }


    static int linear(int[] arr,int i,int t)
    {
        if(i == arr.length-1) {
            return -1;
        }
        if(arr[i]==t) {
            return i;
        }
        else{
            return linear(arr,i+1,t);
        }

    }

    static boolean isSorted(int[] arr,int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }

        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }
}
