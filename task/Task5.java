class Student { int marks = 10; } 


class Task5 { 
public static void main(String... args) 
{ Student s = new Student(); 
switch (s.marks) 
{ 
 
case 10: System.out.println("10"); 
break;
case 98: System.out.println("98"); 
break;
default: System.out.println("100");
} 
} }