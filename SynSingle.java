class A{  
 private static A obj;  
 private A(){}  
   
  static A getA(){  
   if (obj == null){  
      synchronized(A.class){  
        if (obj == null){  
            obj = new A();  
        }  
    }              
    }  
  return obj;  
 }  
  
 static void display()
 {  
   System.out.println("hi");
 }  
}  
class SynSingle
{
    public static void main(String args[])
    {
        A.getA.display();
    }
}
