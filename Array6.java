//Write a Java program to remove the third element from a array list.


import java.util.ArrayList;
public class Array6
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("Red");
     Colors.add("Black");
     Colors.add("White");
     Colors.add("Pink");
     System.out.println(Colors);
     Colors.remove(2);
     System.out.println(Colors);
   }
} 