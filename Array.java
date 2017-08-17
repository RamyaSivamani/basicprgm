import java.lang.reflect.Modifier;
import java.util.*;
class Array{

   public static void main(String[] args) {

        int[] array=new int[4];
    Array c = new Array();
      Class cls = c.getClass();

      // returns the Java language modifiers for this class
      int i = cls.getModifiers();
      //String retval = Modifier.toString(i);
      System.out.println(cls);
   }
} 