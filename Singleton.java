class Single {
    static Single s = new Single();

    private Single() {
        System.out.println("hi");
    }

    static Single getInstance() {
        return s;
    }

    static void setDis( String name) {
        System.out.println(name);
    }
   // static void Dis( String name) {
        //System.out.println(this.name);
  //  }
    static Single display() {
        System.out.println("dis() called");
        return s;
    }
}

class Singleton {
    public static void main(String a[]) {

        Single objS = Single.getInstance();
        objS.display();
        System.out.println(objS.hashCode());

        Single objS2 = Single.getInstance();
        objS2.display();
        System.out.println(objS2.hashCode());
    
        //Single.getInstance().display().setDis("ram");
    }
}