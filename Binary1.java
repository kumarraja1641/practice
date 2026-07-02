import java.util.*;
public class Binary1 {
    static Scanner sc=new Scanner (System.in);
    public static void main(String[] args)

    {
      System.out.println("enter the size of array" );
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("enter the elements of array");
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.println("enter the target element");
      int tg=sc.nextInt();

        int res=binarysearch(arr,tg);
        System.out.println("the index of the target element is: " + res);
    }

    public static int binarysearch(int[] arr,int tg)
    {
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+(r-l)/2);
            if(arr[mid]==tg)
            {
                return mid;
            }
            else if(arr[mid]>tg)
                r=mid-1;
            else
                l=mid+1;
           // }
        }
        return -1;
    }
}

    

