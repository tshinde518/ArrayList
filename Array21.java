// Write a Java program to replace the second element of a ArrayList with the specified element. 



import java.util.ArrayList;
import java.util.Collections;
public class Array21
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             Flowers.set(2,"Jasmine");
             System.out.println(Flowers);
     }
}