import java.util.Scanner;

public class Lab13_2
{
   public static int countWords(String str)
   {
      String[] stringArray = str.split(" ");
      int n = stringArray.length;
      return n;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      do{
      System.out.println("Enter a string: ");
      
      String str = in.nextLine();
      int n = countWords(str);
      System.out.println(n);
    }while(true); 
   }
}