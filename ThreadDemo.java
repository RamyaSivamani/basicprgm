class Count extends Thread
{
   Count()
   {
    // super("my extending thread");
     System.out.println("my thread created" + this);
     start();
    
   }
   public void run()
   {
       System.out.println(Thread.currentThread().getName());
     try
     {
        for (int i=0 ;i<2;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(3000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
   System.out.println("My thread run is over" );   
   }
}
class ThreadDemo
{
   public static void main(String args[])
   {
      Count cnt = new Count();
      try
      {
         while(cnt.isAlive())
         {
           System.out.println(Thread.currentThread().getName());
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(2500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread's run is over" );
   }
}