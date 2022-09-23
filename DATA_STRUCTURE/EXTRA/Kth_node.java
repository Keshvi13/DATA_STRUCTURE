//delete every k-th node of singly linkedlist.
class Kth_node{
	static class Node{
		int value;
		Node next;
	}

	// to remove complete list (needed for case when k is 1)

	static Node freenode(Node n)
	{
		while(n!=null){
			Node next=n.next;
			n=next;
		}
		return n;
	}

	// delete every kth-node
	static Node deleteKthNode(Node head,int k)
	{
		//if linked list is empty
		if(head==null)
			return null;

		if(k==1){
			head=freenode(head);
			return null;
		}

		Node ptr=head;
		Node prev=null;

		int count=0;
		while(ptr!=null){
			count++;

			if(k==count){
				prev.next=ptr.next;
				count=0;
			}
			if(count!=0){
				prev=ptr;
				ptr=prev.next;
			}
			
		}
		return head;
	}
	//function to print linkedlist
	static void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}

	//create new Node
    static Node newNode(int x){
    	Node temp=new Node();
    	temp.value=x;
    	temp.next=null;
    	return temp;
    }

    public static void main(String args[]){
    	Node head=newNode(1);
    	head.next=newNode(2);
    	head.next.next=newNode(3);
    	head.next.next.next=newNode(4);
    	head.next.next.next.next=newNode(5);
    	head.next.next.next.next.next=newNode(6);
    	head.next.next.next.next.next.next=newNode(7);
    	head.next.next.next.next.next.next.next=newNode(8);

    	int k=2;
    	head=deleteKthNode(head,k);
    	display(head);
    }
}