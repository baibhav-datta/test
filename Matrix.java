import java.util.*;
public class Matrix {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int a,b;
      System.out.print("Enter the dimensions of the 2D matrix: \n");  
      a=sc.nextInt();
      b=sc.nextInt();
      
      int m[][]=new int[a][b];
      int c=1,k=1;
      
      for(int i=0;i<a;i++,k*=-1)
      { if(k==1)
        {
         for(int j=0;j<b;j++)
         {
             m[i][j]=c;
             c++;
         }
        }
        if(k==-1)
        {
         for(int j=b-1;j>=0;j--)
         {
             m[i][j]=c;
             c++;
         }
        }
      }
      
      for(int i=0;i<a;i++)
      {
          for(int j=0;j<b;j++)
          {
              System.out.print(m[i][j]+" ");
          }
          System.out.println();
      }
    }
}