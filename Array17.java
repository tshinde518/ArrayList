//Write a Java program to empty an array list.  


import java.util.ArrayList;
import java.util.Collections;
public class Array17
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             Flowers.removeAll(Flowers);
             System.out.println(Flowers);
    }
}
             
             