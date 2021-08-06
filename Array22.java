//Write a Java program to print all the elements of a ArrayList using the position of the elements.


import java.util.ArrayList;
public class Array22
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             int n = Flowers.size();
             for (int index = 0; index < n; index++)
             System.out.println(Flowers.get(index));
     }
}