class Bottle {
void Bottle() {
    System.out.println("Bottle");
}
void Bottle(String c) {
    System.out.println("WaterBottle");
} 
}

class Task4 extends Bottle {
    public static void main(String a[])
    {
        Bottle b=new Bottle();
        b.Bottle("hi");
        
    }


}