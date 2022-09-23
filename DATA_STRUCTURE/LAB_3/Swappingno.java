import java.util.Scanner;
public class Swappingno{
		int a,b;
	public void Numbers(Swappingno s){
        int c;
       c=s.a;
       s.a=s.b;
       s.b=c;
	  } 
    
public static void main(String[] args) {
    Swappingno s=new Swappingno();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter frist number:");
	s.a=sc.nextInt();
	System.out.println("enter second number:");
	s.b=sc.nextInt();
    
     s.Numbers(s);
     System.out.println("after swapping : a"+s.a+",b="+s.b);
	}
}
