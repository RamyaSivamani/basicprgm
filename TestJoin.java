class TestJoin extends Thread {
  int j = 0;

  TestJoin(int x) {
    j = x;
  }

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + " from thread - " + j);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        System.out.println(e);
      }

    }
  }

  public static void main(String args[]) {
    TestJoin t1 = new TestJoin(1);
    TestJoin t2 = new TestJoin(2) {
      public void run() {
        for (int i = 1; i <= 10; i++) {
          System.out.println(i + " from thread - " + j);
          try {
            Thread.sleep(500);
          } catch (Exception e) {
            System.out.println(e);
          }

        }
      }
    };
    TestJoin t3 = new TestJoin(3);
    t1.start();
    t2.start();
    try {
      t2.join();
      System.out.println("thread 2 stopped running");
      t1.join();
      System.out.println("thread 1 stopped running");
    } catch (Exception e) {
      e.printStackTrace();
    }
    t3.start();
  }
}
