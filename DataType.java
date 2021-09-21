import java.io.*;
import java.util.Scanner;
public class DataType 
{
 
 public static void main(String[] args)
 {
 Scanner input = new Scanner (System.in);
 if (input.hasNextShort())
   System.out.println("Prompted as short,int,long but recommended as short");
   else  if (input.hasNextInt())
   System.out.println("Prompted as int,long but recommended as int");
     else if (input.hasNextLong())
    System.out.println("Prompted as long and recommended as long");
   else if (input.hasNextFloat())
  System.out.println("Prompted as float & double and recommended as float");
 
 }
}