//Write a Java program to copy one array list into another.

import java.util.ArrayList;
import java.util.Collections;
public class Array9
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     
     Colors.add("White");
     Colors.add("Black");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     
     ArrayList<String>Animals=new ArrayList<String>();
     Animals.add("Horse");
     Animals.add("Tiger");
     Animals.add("Dog");
     Animals.add("Lion");
     System.out.println(Animals);
     
     Collections.copy(Colors,Animals);
     System.out.println("Colors" +Colors);
     System.out.println("Animals" +Animals);
   }
} 