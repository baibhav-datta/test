import java.util.*;
public class ReverseFibonacci{
  
  public static void main(String[] args)
  {
    
    int n = 100;
      int fib[] = new int[20];
      
        fib[0] = 0;
    
        fib[1] = 1;
    int i;
      for(i=1;fib[i++]<n;)
        fib[i] = fib[i-1] + fib[i-2];
      for(int j=i-2;j>=0;j--)
        System.out.print(fib[j]+" ");
    }
}
