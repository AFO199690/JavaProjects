//Author@ chesta(w.a.p to remove whitespace from a string)
import java.util.*;
public class Main
{
     public static void main(String []args)
     {
         //Take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();    //Initialize the String
        
        str = str.replaceAll("\\s", ""); 
       
        System.out.println("After Removing Whitespaces the entered string is:"+str); 
     }
}