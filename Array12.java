//Write a Java program to extract a portion of a array list. 


import java.util.ArrayList;
import java.util.List;
public class Array12
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
            List<String> sub_List = Flowers.subList(0, 2);
            System.out.println("List of first three elements: " + sub_List);
         }
     }
}