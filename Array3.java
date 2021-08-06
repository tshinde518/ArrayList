// Write a Java program to retrieve an element (at a specified index) from a given array list. 

import java.util.ArrayList;
public class Array3
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("Red");
     Colors.add("Black");
     Colors.add("Yellow");
     Colors.add("Orange");
     Colors.add("Green");
     System.out.println(Colors);
     String d=Colors.get(1);
     System.out.println(" first colour " +d);
     String d1=Colors.get(4);
     System.out.println("second colour " +d1);
    
     
   }
} 