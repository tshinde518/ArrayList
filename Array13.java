// Write a Java program to reverse elements in a array list. 



import java.util.ArrayList;
public class Array13
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
             Flowers1.add("Rose");
             Flowers1.add("Lotus");
             Flowers1.add("Lily");
             Flowers1.add("Sunflower");
             boolean b = Flowers.equals(Flowers1);  
            System.out.println(b);
            Flowers1.add("Tulip");  
            boolean b1 = Flowers.equals(Flowers1);  
            System.out.println(b1);
            
         
            
         
     }
}