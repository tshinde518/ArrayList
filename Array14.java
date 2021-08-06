 //Write a Java program of swap two elements in an array list.  



 import java.util.ArrayList;
 import java.util.Collections;
 public class Array14
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             Collections.swap(Flowers,1,2);
             System.out.println("After swaping  " +Flowers);
     }
}