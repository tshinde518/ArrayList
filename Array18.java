 //Write a Java program to test an array list is empty or not. 



import java.util.ArrayList;
public class Array18
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
            System.out.println("Checking the above array list is empty or not! "+Flowers.isEmpty());
            Flowers.removeAll(Flowers);
            System.out.println("Array list after remove all elements "+Flowers);   
            System.out.println("Checking the above array list is empty or not! "+Flowers.isEmpty()); 
     }
}