import java.util.Scanner;
public class Primenumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no:");
		int n=sc.nextInt();
         
        int count=0;
		for(int i=2;i<n;i++)
		{
           if(n%i==0)
           {
           	count++;
           	break;
           }
		}
		if(count==0){
			System.out.println("prime no");
		}
		else
			System.out.println("not a prime no");
	}
}