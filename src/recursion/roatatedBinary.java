package recursion;

public class roatatedBinary {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(binary(arr,2,0, arr.length-1));

    }

    static int binary(int[] arr,int t,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }

        int mid = s+(e-s)/2;

        if(arr[mid] == t)
        {
            return mid;
        }

        if(arr[s] <= arr[mid])
        {
            if(t>=arr[s] && t<=arr[mid])
            {
                return binary(arr,t,s,mid-1);
            }
            else
            {
                return binary(arr,t,mid+1,e);
            }
        }

        if(t>=arr[mid] && t<=arr[e])
        {
            return binary(arr,t,mid+1,e);
        }

        return binary(arr,t,s,mid-1);
    }
}
