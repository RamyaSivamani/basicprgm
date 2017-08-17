class RunnableDemo implements Runnable {
    private Thread t;
    private String Name;

    RunnableDemo(String name) {
        this.Name = name;
        System.out.println("Creating " + Name);
    }

    public void run() {
        System.out.println("Running " + Name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + Name + ", " + i);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Name + " interrupted.");
        }
        System.out.println("Thread " + Name + " exiting.");
    }

    public void Start() {
        System.out.println("Starting " + Name);
        if (t == null) {
            t = new Thread(Name);
            t.start();
        }
    }
}

public class ThrImp {

    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo();
        Thread t = new Thread(R1, "thread1");
        t.start();

        RunnableDemo R2 = new RunnableDemo("Thread-2");
        Thread t1 = new Thread(R2);
        t1.start();
    }
}
