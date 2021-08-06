// Write a Java program to reverse elements in a array list. 



import java.util.ArrayList;
import java.util.Collections;
public class Array11
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          {
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
            Collections. reverse(Flowers);
             System.out.println(Flowers);
         }
     }
}