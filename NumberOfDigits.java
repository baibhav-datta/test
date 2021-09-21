import java.util.*;
public class NumberOfDigits {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int a,count=0,n;
      System.out.print("Enter a number: \n");  
      a=sc.nextInt();

      while(a!=0)
      {
          count++;
          a/=10;
      }
      
    if(count%2==0)
        n=count*count;
    else if(count%3==0)
        n=count*count*count;
    else
        n=(count-1)*(count-1);
     
    if(count==1)
      System.out.println("Result="+count);
    else
      System.out.println("Result="+count+","+n);
       
    }
}