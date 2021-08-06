//Write a Java program to search an element in a array list. 


import java.util.ArrayList;
public class Array7
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("White");
     Colors.add("Red");
     Colors.add("Pink");
     Colors.add("Blue");
     System.out.println(Colors);
     if(Colors.contains("Pink"))
     {
       System.out.println("Found the element");
     }
     else
     {
        System.out.println("There is no element");
     }
     
   }
} 