import java.util.*;
public class Day1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements in the array");
        System.out.println("enter the size of the elemnt in array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target sum");
        int tg=sc.nextInt();
        int[] res=twosum(arr, tg);

        if(res[0]==-1)
        {
            System.out.println("No such pair exists");
        }
        else
        {
            System.out.println("The pair is "+res[0]+" and "+res[1]);
        }



    }
    public static int[] twosum(int[] arr,int tg)
    {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int need=tg-arr[i];
            if(h1.containsKey(need))
            {
                return new int[]{need,arr[i]};
            }
            h1.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

}