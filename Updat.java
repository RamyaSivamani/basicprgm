
import java.util.Scanner;
import java.util.Arrays;

public class Updat
{
   public static void main(String args[])
   {
       int size, i, updt, current;
       int arr[] = new int[2];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
       System.out.print("current element : ");
	    current = scan.nextInt();
       System.out.print("Update element : ");
       updt = scan.nextInt();
       for(i=0; i<size; i++)
       {
           if(arr[i]==current)
           {
               arr[i]=updt;
           }
       }  
           System.out.print("\nNow the New Array is :\n");
         //  for(i=0; i<(size); i++)
           //{
              // System.out.print(arr[i]+ " ");
                System.out.print(Arrays.toString(arr));
           //}
       }
   
}