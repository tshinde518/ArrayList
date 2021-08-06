// Write a Java program to clone an array list to another array list. 



import java.util.ArrayList;
public class Array16
{
      public static void main(String[] args)
      {
          ArrayList<String>Flowers=new ArrayList<String>();
          
             Flowers.add("Rose");
             Flowers.add("Lotus");
             Flowers.add("Lily");
             Flowers.add("Sunflower");
             System.out.println(Flowers);
             ArrayList Flowers1=(ArrayList)Flowers.clone();                  
             System.out.println(Flowers1);
      }
}