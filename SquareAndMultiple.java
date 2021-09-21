import java.util.*;
public class SquareAndMultiple {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.print("Enter the two integer values: \n");  
      a=sc.nextInt();
      b=sc.nextInt();
      
      if(b%2==0)
      {
          if(b%a==0)
          {
              if(b==(a*a))
              {
                  System.out.println(b+" is an even number, square & multiple of "+a);
              }
              else
              {
                  System.out.println(b+" is an even number, multiple of "+a+"="+(b/a)+"s of "+a);
              }
          }
          else
          {
              System.out.println(b+" is an even number,but neither square nor multiple of "+a);
          }
      }
      else
      {
          System.out.println(b+" is not an even number,neither square nor multiple of "+a);
      }
      
    }
}