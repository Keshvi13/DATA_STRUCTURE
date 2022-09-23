import java.util.*;
class Queue2
{
	int a[]=new int[10];
	int front=-1;
	int rear=-1;
    
	public void enqueue(int n){
       if((rear+1)%10!=front)
       {
       	rear=(rear+1)%10;
       	a[rear]=n;
       	}
       else 
       {
        System.out.println("Queue Overflow Error");
       }
	}
	public int dequeue(){
       if(front!=rear){
       	front=(front+1)%10;
       	int n=a[front];
       	return n;

       }
       	
      	else 
       {
        System.out.println("Queue Underflow Error");
       }
       	
	return 0;  
	}
	public void display(){
		if(front!=rear){ 
		  for(int i=(front+1)%10;i<=rear;i++){
			System.out.println(a[i]+ " ");
		  }
	    }
	    else{
	    	 System.out.println("Queue is empty cant display!!");
	    }
	}
}
public class CircularQueue{
 public static void main(String[] args) {
		Queue2 q=new Queue2();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("\n1.insert at frist elements of Queue\n2.delete a frist elements of in Queue\n3.display all elements\n4.exit\nenter opration number:");
			int n=sc.nextInt();
			
	        if(n==1){
				System.out.println("how to create in insert elements of Queue:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           q.enqueue(sc.nextInt());
                                  }
                           System.out.println("insert elements is:");
                           q.display();
                           System.out.println("\n"); 	
			}
			else if(n==2){
				System.out.print("delete elements is:"+q.dequeue());
				System.out.println("\n"); 
			}
			else if(n==3){
				System.out.print("display elements is:\n" );
				q.display();
				System.out.println("\n"); 
			}
            else if(n==4){
            	break;
            }
        }
    }
}