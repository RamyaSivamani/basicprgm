class Hello{

public static void main(String[] args) {
int a[] = { 10, 20, 30, 40, 50 };
int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
Hello he=new Hello();
Class c = he.getClass();
String s = c.getName();
System.out.println(c);
System.out.println(s);

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(b[i][j]);
}
System.out.println();
}
}

}
