// Write a Java program to join two array lists.


import java.util.ArrayList;
public class Array15
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             ArrayList<String>Flowers1=new ArrayList<String>();
             Flowers1.add("Tulip");
             Flowers1.add("Jasmine");
             Flowers1.add("Marigold");
             Flowers1.add("Daisy");
             System.out.println(Flowers1);
             ArrayList<String>Flowers2=new ArrayList<String>();
             Flowers2.addAll(Flowers);
             Flowers2.addAll(Flowers1);
             System.out.println(Flowers2);
         
     }
}  