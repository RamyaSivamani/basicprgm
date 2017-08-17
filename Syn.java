class PrintDemo {
    public  void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter " + i+Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
         PD.printCount();
          System.out.println("ending " + threadName);
        }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class Syn {
    public static void main(String args[]) {

        PrintDemo VS= new PrintDemo();

        new ThreadDemo("Thread - 1 ", VS).start();
        new ThreadDemo("Thread - 2 ", VS).start();

    }
}