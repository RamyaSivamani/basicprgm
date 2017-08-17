interface printable{  
void print();  
}  
class A {  
public void print(){System.out.println("Hello");} 
}
class Task3 extends A  implements printable{
  
public static void main(String args[]){  
Task3 obj = new Task3();  
obj.print();  
 }  
}  