import java.util.*;
public class MyClass {
    public static void printArray(int[] a,int n)
    {
      for(int i=0;i<n;i++)
      {
          System.out.println(a[i]+",");
      }
        
    }

    public static void pos(int[] a,int n,int p)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]==p)
             System.out.println(i+",");
        }
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.print("Enter the number of elements you want to store: ");  
      n=sc.nextInt();
      int[] array=new int[10];
      
      System.out.println("Enter the elements of the array ");
      for(int i=0;i<n;i++)
      {
          array[i]=sc.nextInt();
      }
      
      printArray(array,n);
      
      System.out.print("Enter the element you want to find: ");  
      int p=sc.nextInt();
      pos(array,n,p);

      
  
    
    }
}