import java.util.*;
public class MyClass {
    public static void printArray(int[] a,int n)
    {
      for(int i=0;i<n;i++)
      {
          System.out.println(a[i]+",");
      }
        
    }
    public static void sortArray(int[] a,int n)
    {
        int temporary = 0;
  
   
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temporary = a[i];
                    a[i] = a[j];
                    a[j] = temporary;
                }
            }
        }
  
      
        System.out.println("Elements of array sorted in ascending order: ");
        printArray(a,n);
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
      sortArray(array,n);
    
    }
}