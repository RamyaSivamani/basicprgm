
class Parent
{
    public void display()
    {
System.out.println("hi");
    }
}
class Subclass1 extends Parent
{
 //@Override
    public void dispay()
    {
        System.out.println("preethi");
    }
}
class Subclass2 extends Subclass1
{
 //@Override
    public void displa()
    {
        System.out.println("ramya");
    }
}
class Subclass  //extends Subclass2
{
public static void main(String args[])
{
    Subclass2 obj=new Subclass2();
    obj.displa();
}
}
