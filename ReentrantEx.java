class SyCls {  
    public synchronized void doSomeThing()
{  
    doAnotherThing();  
    System.out.println("this isdoSomeThing() method");  
    }  
    public synchronized void doAnotherThing()
{  
    System.out.println("this is doAnotherThing() method");  
    }  
} 
public class ReentrantEx{  
public static void main(String
args[]){  
final ReentrantEx re=new ReentrantEx();   
Thread t1=new Thread(){  
public void run(){  
new SyCls().doSomeThing();//calling method of SyCls class  
} 
};  
t1.start();  
}}   