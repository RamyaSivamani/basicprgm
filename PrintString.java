import java.util.Scanner;
import java.util.ArrayList;
class PrintString
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        ArrayList<String> b=new ArrayList<String>();

        for(int i=0;i<a;i++)
        {
            String c=scan.next();
            b.add(c);
        }
            System.out.println(b);   
}
}