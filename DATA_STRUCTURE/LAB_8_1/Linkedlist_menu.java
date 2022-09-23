import java.io.*;
import java.util.Scanner;
   
  class Linkedlist_menu1{
   
    Node head; 

     class Node {
   
        int value;
        Node next;
   
        // Constructor
        Node(int a)
        {
            value = a;
            next = null;
        }
    }

    //insert a node at frout of the linked list

    public void insertatfront(int new_value)
    {
        // Create a new node with given data
        Node n_node = new Node(new_value);
         
        n_node.next=head;
        
        head=n_node;
                
    }

    public void insertatmiddale(int new_value){

        // Create a new node with given data
        Node n_node = new Node(new_value);
         if(head==null)
            return ;

        n_node.next=head;

        int count=0;
        Node t=head;
        while(t!=null){

            t=t.next;
            count++;

          }
 
            // 'count' the number of nodes after which
            // the new node is to be inserted
            int total = ((count % 2) == 0) ? (count / 2):(count+ 1) / 2;
            t = head;
 
            // 'ptr' points to the node after which
            // the new node is to be inserted
            while ((total-1) > 1){
                t= t.next;
            }
 
            // insert the 'newNode' and adjust
            // the required links
            n_node.next = t.next;
            t.next = n_node;

     }
        
    //delete a frist node of the linked list

   public void deleteposition(int position)
    {
        if(head==null)
            return ;

        Node temp=head;

        if(position==0){
            head=temp.next; //change head
            return ;
        }

        //find previous node of the node to be deleted
        for(int i=1;temp!=null && i<position;i++){
            temp=temp.next;
         
         }

            if(temp==null || temp.next==null)
                return ;

            Node next=temp.next.next;
            temp.next=next;        
    }

    //delete a frist node

    public void deletefrist()
    {
        if(this.head!=null)
            {
                Node temp=this.head;
                this.head=this.head.next;
                temp=null;
            }
    }

    //delete a last node

     public void deletelast()
    {
        if(this.head!=null)
            {
               if(this.head.next==null){
                this.head=null;
               }
               else{
                Node temp=this.head;
                while(temp.next.next!=null)
                    temp=temp.next;
                Node lastnode=temp.next;
                    temp.next=null;
                    lastnode=null;
               }
            }
    }

    //insert a node at the end of the linked list

    public void insertend(int new_value){
         Node n_node = new Node(new_value);
        n_node.next=null;
         if(head==null){
            head=n_node;
         }
         else{
            Node temp;
            temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=n_node;
         }
    }


    //display all nodes

    public void display(){
        Node d_node=head;       
        while(d_node!=null){
        System.out.print(d_node.value+" ");
        d_node=d_node.next;
        
      }
    }  
} 
   
public class Linkedlist_menu{
public static void main(String[] args)  {
        
        Linkedlist_menu1 list = new Linkedlist_menu1();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("\n1.insert a node at the frount of the linked list:\n2.delete from a specified position\n3.display all nodes\n4.delete a frist node:\n5.delete a last node:\n6.insert a node at the end:\n7.insert at middle:\n8.exit\n\nenter opration number:");
            int n=sc.nextInt();
            
            if(n==1){
                        System.out.println("how to create in insert elements of Linkedlist:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           list.insertatfront(sc.nextInt());
                                  }
                           System.out.println("insert elements is:");
                           list.display();
                           System.out.println("\n");       
            }
            else if(n==7){
                      System.out.println("enter elemnet in middle:");
                      int b = sc.nextInt();
                      list.insertatmiddale(b); 
                      list.display();
                      System.out.println("\n");      
            }
            else if(n==2){
                System.out.println("enter delete position:");
                int c= sc.nextInt();
                list.deleteposition(c);
                System.out.println("linked list after deletion at position:"+c);
                list.display();
                  System.out.println("\n");                     
            }
            else if(n==3){
                System.out.print("display elements is:");
                list.display();
                  System.out.println("\n"); 
            }
            else if(n==4){
                System.out.println("delete frist position:");
                list.deletefrist();
                list.display();
                 System.out.println("\n");              
            }
            else if(n==5){
                System.out.println("delete last position:");
                list.deletelast();
                list.display();
                 System.out.println("\n"); 
            }
             else if(n==6){
               System.out.println("how to create in insert elements of Linkedlist:");
                        int b = sc.nextInt();
                        System.out.print("Enter insert = "+b+" elements :\n");
                        for(int i=0;i<b;i++){
                           list.insertend(sc.nextInt());
                                  }
                           System.out.println("end of insert elements is:");
                           list.display();
                           System.out.println("\n");
             }
             
             else if(n==8){
                break;
             }
        }
    }
}