//Write a Java program to iterate through all elements in a array list.


import java.util.ArrayList;
public class Array2
{
   public static void main(String[] args)
   {
     ArrayList<String>Colors=new ArrayList<String>();
     Colors.add("Red");
     Colors.add("White");
     Colors.add("Pink");
     Colors.add("Green");
     System.out.println(Colors);
     for(int i=0;i<Colors.size();i++)
     {
        System.out.println(Colors.get(i));
     }
  }
}