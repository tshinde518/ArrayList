//Write a Java program to update specific array element by given element.


import java.util.ArrayList;
public class Array5
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("Red");
     Colors.add("Yellow");
     Colors.add("Pink");
     Colors.add("Purpule");
     System.out.println(Colors);
     Colors.set(2,"Black");
     System.out.println(Colors);
     
     
   }
} 