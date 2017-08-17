//import org.junit.*;
class Ani
{void eatSomething(){System.out.println("eating something1121");}

}
class Animal extends Ani {

void eatSomething(){System.out.println("eating something");

}
}

class Dog extends Animal
{

 void eatSomething()
{System.out.println("eating foods");}

}

class TestAnnotation extends Dog
{
public static void main(String args[]){
//Dog a=new Dog();
Ani a=new Ani();
//Animal a=new Animal();
a.eatSomething();
}
}
