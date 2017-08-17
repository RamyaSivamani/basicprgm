interface person
{
    void eat();
}
public class Inter
{
    public static void main(String args[])
    {
      person p=  new person()
        {
         public  void eat()
          {
             System.out.println("food"); 
         
          }  
        };
       p.eat();
         
    }
}