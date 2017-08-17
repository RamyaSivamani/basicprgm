import java.io.*;
import java.lang.ArrayIndexOutOfBoundsException;
class Exp

{
    public static void main (String[] args) 
    {
         
       
        int[] arr = new int[4];
         
        try
        {
            int i = arr[4];
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        
         
        // not a appropriate handler
        catch(Exception ex)
        {
            System.out.println("Exception has been caught"+ex);
        }
        finally
        {
            System.out.println("finally block executed");
        }
         
      System.out.println("Outside try-catch-finally clause");
       
       
    }
}
