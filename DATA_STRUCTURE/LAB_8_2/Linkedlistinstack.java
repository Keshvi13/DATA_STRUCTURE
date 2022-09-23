import java.io.*;
import java.util.Scanner;

class Linkedlistinstack1{

	Node head;

	class Node {
		int value;
		Node next;

      }
      Node top;

      Linkedlistinstack1(){
      	this.top=null;      

	}
	 public void insertatfront(int new_value){

	 	Node n_node=new Node();
        if(n_node==null){
        	System.out.println("stack overflow");
        	return;
        }
        n_node.value=new_value;
        n_node.next=top;
        top=n_node;
	 }

   public void topofthestack(){
   if(top!=null){
   	    int a=top.value;
        System.out.println(a); 
     }
    
    else{
     	System.out.println("stack empty");
     	
     }
    
     
   }
   public void popofthestack(){
   if(this.top!=null)
            {
                Node temp=this.top;
                this.top=this.top.next;
                System.out.println(temp.value);
                temp=null;
            }
 }

	 public void display(){
    	Node d_node=top;       
    	while(d_node!=null){
    	System.out.print(d_node.value+" ");
        d_node=d_node.next;
        }
      }

   public void deletelast()
    {
        if(this.top!=null)
            {
               if(this.top.next==null){
                this.head=null;
               }
               else{
                Node temp=this.top;
                while(temp.next.next!=null)
                    temp=temp.next;
                Node lastnode=temp.next;
                    temp.next=null;
                    lastnode=null;
               }
            }
    }

}
public class Linkedlistinstack{
public static void main(String[] args)  {
        
      Linkedlistinstack1 list = new Linkedlistinstack1();
		Scanner sc=new Scanner(System.in);
		while(true){
			   System.out.print("\n1.insert a node at the front of the stack in Linkedlist:\n2.display node:\n3.top of the element is:\n4.delete at top element:\n5.delete at end of stack of linkedlist \n6.exit \n\nenter opration number:");
			   int n=sc.nextInt();
			
	           if(n==1){
						System.out.println("how to create in insert elements of Linkedlist in stack:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           list.insertatfront(sc.nextInt());
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
				      System.out.print("display top element is:");
				      list.topofthestack();
                      System.out.println("\n"); 
			     }  

              else if(n==4){
                   System.out.print("delete top of the element is:");
                   list.popofthestack();
                   System.out.println("\n");
                       }

               else if(n==5){
                  System.out.print("delete at end of the element is:");
                   list.deletelast();
                   list.display();
                   System.out.println("\n");
               } 
               else if(n==6){
                  break;
               } 
            }
    }
}
