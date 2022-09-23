import java.util.Scanner;
public class Replaceno{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter size of array:");
		int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        System.out.println("enter frist no:");
        int n1=sc.nextInt();
        System.out.println("enter second no:");
        int n2=sc.nextInt();
        int n3;
        int count=0;
        for(int i=0;i<n;i++){
        	if(a[i]==n2){
        		a[i]=n1;
        		count++;
        		System.out.println("index of replaced number"+i);
        	}
        }
        if(count==0){
        	System.out.println("no element has matches");
          }
          System.out.println("new arrray=");
          for(int i=0;i<n;i++){
          	System.out.print(a[i]+",");
          }

	}
}