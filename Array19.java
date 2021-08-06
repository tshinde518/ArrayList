//Write a Java program to trim the capacity of an array list the current list size. 


import java.util.ArrayList;
public class Array19
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             Flowers.trimToSize();
             System.out.println("trim the capacity of an array  " +Flowers);
     }
}