import java.io.*;
import java.util.Scanner;

   class QNode {
		int value;
		QNode next;

    public QNode(int value){
     	this.value=value;
     	this.next=null;
     }   	   
}	
    
  class Queue
    {
         QNode front,rear;

      public Queue(){
         this.front=this.rear=null;  
         }

     public void enqueue(int value)
      {
	   QNode nnode = new QNode(value);

       //Queue is empty ,then new node is front and rear both

       if(this.rear==null){
       	this.front=this.rear=nnode;
       	return;
       }
       
       //add the new node at the end of the Queue and change rear

       this.rear.next=nnode;
       this.rear=nnode;
     }


   public void dequeue(){

      //Queue is empty then return null

     	if(this.front==null){
     		return;
     	}

     	QNode nnode =this.front;
     	this.front=this.front.next;
        System.out.println(nnode.value);
     	if(this.front==null)     		
     		this.rear=null;
    }
  
    public void display(){
    	QNode d_node=front;       
    	while(d_node!=null){
    	System.out.print(d_node.value+" ");
        d_node=d_node.next;
        }
     }
}
	

public class Linkedlistinqueue{
public static void main(String[] args)  {       
        Queue list = new Queue();
		Scanner sc=new Scanner(System.in);
		while(true){
			   System.out.print("\n1.insert a node at the front of the queue in Linkedlist:\n2.display node:\n3.delete node\n4.exit \n\nenter opration number:");
			   int n=sc.nextInt();
			
	           if(n==1){
						System.out.println("how to create in insert elements of Linkedlist in queue:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           list.enqueue(sc.nextInt());
                                  }
                           System.out.println("insert elements is:");
                           list.display();
                           System.out.println("\n");
                       }


                else if(n==2){
				      System.out.print("display elements is:");
				       list.display();
                  System.out.println("\n"); 
			     }  

			     else if(n==3){
				      System.out.print("delete elements is:");
				      list.dequeue();
                  System.out.println("\n"); 
			     } 

			      else if(n==4){
				     break; 
			     }    

			 }
		}
	}
