class First extends Thread{
    public void run()
        { for(int i=0;i<10;i++)
           {
               System.out.println(i);
               join(1000);
           }
        }
}
class Thr
{
public static void main(String[] args) {
    First f=new First();
    First f1=new First();
    f.start(); 
    f1.start();
}
}