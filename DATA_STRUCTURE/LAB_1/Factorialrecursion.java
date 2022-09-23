import java.util.Scanner;
public class Factorialrecursion{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no given output in Factorial:");
	  int n= sc.nextInt();
      
      int factorial=multiplynumbers(n);
      System.out.println("factorial of:"+factorial);
  }
 public static int multiplynumbers(int n){
   	if(n>=1){
   		return n*multiplynumbers(n-1);
   	}
    else
   	  return 1;
   }
}

