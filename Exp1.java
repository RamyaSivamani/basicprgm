import java.io.*;
import java.lang.ArrayIndexOutOfBoundsException;
class Exp1
{
    public static void main (String[] args)
    {
         
    try
    {
         
        //String str =null;
           int data=100;
           int i=data/0;  
        //int num = Integer.parseInt(str.length());
             
        // this statement will execute
        // as no any exception is raised by above statement
        System.out.println("Inside try block");
        try{
            int[] arr = new int[4];
           int s = arr[4];
             System.out.println("Inside try block");
        }
    
         catch(ArithmeticException ex)
        {
             
          System.out.println("catch block executed..."+ex);
             
        }
        finally
        {
            System.out.println("finally block1 executed");
        }
    }
    catch(Exception ex)
    {
             
        System.out.println("catch block executedramya..."+ex);
             
    }
     
    finally
    {
        System.out.println("finally block executed");
    }
 
    System.out.println("Outside try-catch-finally clause");
    }
}