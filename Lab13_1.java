import java.util.Scanner;

public class Lab13_1
{
   public static String repeat(String str, int n)
   {
      String output = str;
       for(int i=1;i<n; i++){
       output = output + str;
        } 
      return output;
      
   }

   public static void main(String[] args)
   {
    do{
      System.out.println("Enter a string and n separated by space: ");
      Scanner in = new Scanner(System.in);
      String phrase = in.nextLine();
      String[] stringArray = phrase.split(" ");
      String str = stringArray[0];
      String num = stringArray[1];
      int n = Integer.parseInt(num);
      
      String output=repeat(str,n);
      System.out.println(output);
      
    }while(true);  
   }

}