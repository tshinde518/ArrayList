//Write a Java program to increase the size of an array list. 


import java.util.ArrayList;
import java.util.Collections;
public class Array20
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);          
             Flowers.ensureCapacity(7);
             Flowers.add("Marigold");
             Flowers.add("Tulip");
             Flowers.add("Jasmine");
          System.out.println("New array list " + Flowers);
     }
}