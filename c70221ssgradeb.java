//Shanika Seales 2/21/2107

import java.util.*;

public class c70221ssgradeb
{
   public static void main (String [] arg)
   {
      Scanner input = new Scanner(System.in);
      
      String[] name  = new String[5]; 
      double[] sum1  = new double[10];
      double[] sum2  = new double[10];
      double[] sum3  = new double[10];
      double[] sum4  = new double[10];
      double[] avg   = new double[10];
      double[] total = new double[10];
      String[] l     = new String[10];
      
      for(int c = 0; c <name.length; c++)
      {
         System.out.print("Enter your name:  ");
         name[c] = input.next();
         
         System.out.println();
         System.out.print("Enter your first grade:  ");
 		 sum1[c]  = input.nextDouble();
         check1(sum1);
         
         System.out.println();
         System.out.print("Enter your second grade:  ");
 		 sum2[c]  = input.nextDouble();
         check2(sum2);
         
         System.out.println();
         System.out.print("Enter your third grade:  ");
 		 sum3[c]  = input.nextDouble();
         check3(sum3);
         
         System.out.println();
         System.out.print("Enter your fourth grade:  ");
 		 sum4[c]  = input.nextDouble();
         check4(sum4);
         
         total[c] = sum1[c] + sum2[c] + sum3[c] + sum4[c];
         avg[c] = total[c]/4;
         
		 l = getLetterGrade(avg);
		 
         System.out.println();
         System.out.println(name[c] + " ");
         System.out.println("Total Grade is " + total[c]);
         System.out.println("Average is " + avg[c]);
         System.out.println("Average Letter Grade is " + l[c]);
      }
   }
   
   public static void check1(double[] sum1)
   {
     Scanner input = new Scanner(System.in); 

     for(int c = 0; c < 7; c++) 
     {
       if( sum1[c] < 0 || sum1[c] > 100)
       {
         System.out.print("Re-enter grade:  ");
         sum1[c] = input.nextInt();
       }
     }  
   }
   
      
   public static void check2(double[] sum2)
   {
     Scanner input = new Scanner(System.in); 
          
     for(int c = 0; c < 7; c++) 
     {
       if( sum2[c] < 0 || sum2[c] > 100)
       {
         System.out.print("Re-enter grade:  ");
         sum2[c] = input.nextInt();
       }
     }  
   }
   
      
   public static void check3(double[] sum3)
   {
     Scanner input = new Scanner(System.in); 
       
     for(int c = 0; c < 7; c++) 
     {
       if( sum3[c] < 0 || sum3[c] > 100)
       {
         System.out.print("Re-enter grade:  ");
         sum3[c] = input.nextInt();
       }
     }  
   }
   
      
   public static void check4(double[] sum4)
   {
     Scanner input = new Scanner(System.in); 
     
     for(int c = 0; c < 7; c++) 
     {
       if( sum4[c] < 0 || sum4[c] > 100)
       {
         System.out.print("Re-enter grade:  ");
         sum4[c] = input.nextInt();
       }
     }  
   }
   
   public static String[] getLetterGrade(double[] avg)
   {            
      String[] l = new String[10];
      
      for(int c = 0; c < 7; c++) 
      { 
         if (avg[c] >= 90)
 		   {
            l[c] = "A";
 		   }
 		   else if (avg[c] >= 80)	
 		   {
            l[c] = "B";
 		   }
 		   else if (avg[c] >= 70)	
 		   {
            l[c] = "C";
 		   }
 		   else if (avg[c] >= 60)	
 		   {
            l[c] = "D";
 		   }
 		   else 	
 		   {
            l[c] = "F";
 		   }
      }
      return l;
   }  
}