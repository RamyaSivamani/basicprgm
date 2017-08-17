interface A {
    public void display();
    default void hel()
{   try
    {
    Thread.currentThread().sleep(3000);
    System.err.println("hello");
}catch(Exception e)
{
    e.printStackTrace();
}
}
}

public class Simple 
{
    
    
    public static void main(String[] args) {
    A ob=new A()   
    {
        public void display()
        {
            System.out.println("hai");
        }
        public void mainn()
    {
        System.out.println("655hffhj");
    }

    };
    ob.hel();
    ob.display();
}}
