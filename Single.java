class Singleton
{
   static Singleton s=new Singleton();
    private Singleton()
    {

    }
   static Singleton getMethod()
   {
       return s;
   }
   static void add(int a,int b)
   {
       int c=a+b;
       System.out.println(c);
    
   }
}
class Single
{
    public static void main(String args[])
    {
        Singleton.getMethod().add(2,3);
    }
}