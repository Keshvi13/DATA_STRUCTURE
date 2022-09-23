import java.util.Scanner;
import java.io.*;
public class Secondlargest{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);

		System.out.println(" enter size of array:");
		int n=sc.nextInt();

		int a[]=new int[n];
        System.out.println(" enter the elements of the array:");

        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
         
         // DECLERING MAXIMUM ELEMENT
        int max=Integer.MIN_VALUE;

        //COMPARING WITH EACH ELEMNTS
        
        
        for(int i=0;i<n;i++){
        	if(a[i]>max){
        		max=a[i];
        	}
        }
        System.out.println("maximum value :"+max);

         int second_max=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        	if(a[i]>second_max && a[i]!=max){
        		second_max=a[i];
        	}
        }

         System.out.println("second maximum value :"+second_max);
	}
}