import java.util.*;
public class SearchinsPos {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be inserted");
        int k=sc.nextInt();
        int res=searchinpos(arr,k);
        System.out.println("the position of the element is: " + res);
    }
    public static int searchinpos(int[] arr,int k)
    {
        int l=0,r=arr.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==k)
            {
                return mid;
            }
            else if(arr[mid]>k)
                r=mid-1;
            else
                l=mid+1;
        }
        return l;

    }
    
}
