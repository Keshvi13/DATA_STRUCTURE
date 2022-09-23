import java.util.*;
class Queue1
{
	int a[]=new int[10];
	int front=-1;
	int rear=-1;

	public void enqueue(int n){
       if(rear>=9)
       	System.out.println("overflow");
       else{
       		if(rear==-1){
       			front=0;	
       		}
    	    rear++;
    	    a[rear]=n;    
       }
	}
	public int dequeue(){
        if(rear<front){
        	System.out.println("underflow");
       		return -1;
        }	
       	else{
       		return a[front++];
       	} 
	   
	}
	public void display(){
		for(int i=front;i<=rear;i++){
			System.out.println(a[i]+ " ");
		}
	}
}
public class Queue{
 public static void main(String[] args) {
		Queue1 q=new Queue1();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("\n1.insert\n2.delete\n3.display\n4.exit\nenter opration number:");
			int n=sc.nextInt();
			
	        if(n==1){
				System.out.print("enter a value for insert:");
				q.enqueue(sc.nextInt());	
			}
			else if(n==2){
				System.out.print("delete elements is:"+q.dequeue());
			}
			else if(n==3){
				System.out.print("display elements is:" );
				q.display();
			}
            else if(n==4){
            	break;
            }
        }
    }
}