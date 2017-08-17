import java.io.*;  
public class Buffer1{    
public static void main(String args[])throws Exception{             
    //InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));            
    System.out.println("Enter your name");    
    String name=br.readLine();    
    System.out.println("Welcome "+name);    
}    
}  