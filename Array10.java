//Write a Java program to shuffle elements in a array list.


import java.util.ArrayList;
import java.util.Collections;
public class Array10
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("Red");
     Colors.add("Pink");
     Colors.add("Orange");
     Colors.add("White");
     System.out.println(Colors);
     Collections.shuffle(Colors);
     System.out.println("After shuffle" +Colors);
   }
} 