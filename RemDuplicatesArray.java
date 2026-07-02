import java.util.*;
public class RemDuplicatesArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       System.out.println("the unique elemeents present in that array is+"+ removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] arr)
    {
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j])
            {
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }

}
