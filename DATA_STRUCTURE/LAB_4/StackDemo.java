import java.util.*;
class Stack1{
	int [] a= new int[5];
	int top=-1;
  int n,m;
	public void push(int n){
		if(top>=4)
		{
			System.out.println("stack overflow");
		}
		else{
			top++;
			a[top]=n;
		}
	}

	public int pop(){
		if(top<0){
			System.out.println("stack uderflow");
			return -1;
		}
		return a[top--];
	}
    
    public int peep(int b){
 	if(a[top-n+1]<=-1){
 		System.out.println("stack underflow // overflow");
    }
 	 return a[top-n+1];
    }


    public void change(int n,int m){
      if(top==-1)
     {
      System.out.println("The Stack is Overflow..."); 
     }
     else
     {
       a[n]=m;
       System.out.println(a[n]);
     }

  }


  
	 public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}

public class StackDemo{
	public static void main(String[] args) {
		Stack1 s=new Stack1();

		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("\n1.push\n2.pop\n3.peep\n4.change\n5.display\n6.exit\nenter opration number:");
			         int n=sc.nextInt();
			
			if(n==1){
				       System.out.print("enter a value for push:");
				       s.push(sc.nextInt());	
			  }
			else if(n==2){
	    			    System.out.print("popped elements is:"+s.pop());
			  }
			else if(n==3){
				        System.out.println("enter ith element");
				        int a = s.peep(sc.nextInt());
				        System.out.println("element is"+a);
			  }
      else if(n==4){
                System.out.println("enter position of the top");
				        int x =sc.nextInt();
				        System.out.println("enter elements");
				        int y=sc.nextInt();
				        s.change(x,y);
            }
			else if(n==5){
				       s.display();
			}
			else if(n==6){
				break;
			}
		}
	}
}