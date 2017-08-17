import java.io.BufferedReader;
import java.io.FileReader;

class Buffer {
    public static void main(String[] args) throws Exception {
        String st;
        FileReader file = new FileReader("C:/ramya/input.txt");
        BufferedReader bf = new BufferedReader(file);
        while (true) {
            st = bf.readLine();
            if (st != null) {
                System.out.println(st);
            }
            if (st == null) {
                break;
            }
        }
    }
}