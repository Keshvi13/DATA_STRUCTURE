import java.util.*;

class BST{
	public static void main(String[] args){
		Tree t=new Tree();					
		t.insert(5);							
		t.insert(3);													
		t.insert(2);											
		t.insert(4);																					
		t.insert(1);							
		t.insert(8);														
		t.insert(6);							
		t.insert(7);																															
		t.insert(9);									
		t.insert(10);																						
		t.inOrder();
		t.preOrder();
		t.postOrder();
		t.delete(5);
		t.preOrder();
	}
}

class Tree{
   
	Node root;

	class Node
	{
		int data;
		Node right;
		Node left;
		Node(int a)
		{
			data=a;
			right=null;
			left=null;
		}
	}

	public void insert(int n){
		Node nNode=new Node(n);

		if(root==null){
			root=nNode;
		}
		else{
			Node temp=root;

			while(temp.left!=null || temp.right!=null){
				if(nNode.data>=temp.data && temp.right!=null){
					temp=temp.right;
				}
				else if(nNode.data<temp.data && temp.left!=null){
					temp=temp.left;
				}
				else{
					break;
				}
			}
			if(nNode.data>temp.data){
				temp.right=nNode;
			}
			else{
				temp.left=nNode;
			}
		}
	}

    public void inOrder(){
		System.out.print("In Order  :	");
        Stack<Node> st=new Stack<Node>();
		Node temp=root;
		if(temp==null){
			System.out.print("Tree Empty");
			return;
		}

        while(temp!=null || st.size()>0){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            temp=st.pop();
            System.out.print("["+temp.data+"] ");
            temp=temp.right;
        }
        System.out.println();
    }

	public void preOrder(){
		System.out.print("Pre Order :	");
		if(root==null){
			System.out.print("Tree Empty");
			return;
		}
		else{
			Stack<Node> st1=new Stack<Node>();
			st1.push(root);
			while(!st1.empty()){
				Node temp=st1.pop();
				System.out.print("["+temp.data+"] ");

				if(temp.right!=null){
					st1.push(temp.right);
				}
				if(temp.left!=null){
					st1.push(temp.left);
				}
			}
		}
		System.out.println();
	}

	public void postOrder(){
		System.out.print("Post Order:	");
		if(root==null){
			System.out.print("Tree Empty");
			return;
		}
		else{
			Stack<Node> st1=new Stack<Node>();
			Stack<Node> st2=new Stack<Node>();
			st1.push(root);
			while(st1.size()>0){
				Node temp=st1.pop();
				st2.push(temp);

				if(temp.left!=null){
					st1.push(temp.left);
				}
				if(temp.right!=null){
					st1.push(temp.right);
				}
			}

			while(st2.size()>0){
				Node temp1=st2.pop();
				System.out.print("["+temp1.data+"] ");
			}
		}
		System.out.println();
	}

	public Node inorderSuccesor(Node temp){
		boolean rchilde=true;
		Node parent=temp;
		temp=temp.right;

		if(temp.left!=null){
			rchilde=false;

			while(temp.left!=null){
				parent=temp;
				temp=parent.left;
			}
		}

		if(rchilde){
			parent.right=temp.right;
		}
		else{
			parent.left=temp.right;
		}

		return temp;
	}

	public void delete(int n){
		System.out.println("After Deleting A Node");
		if(root==null){
			System.out.println("tree empty");
		}
		else{
			Node parent=null;
			Node temp=root;

			while(temp!=null && temp.data!=n){
				parent=temp;

				if(n>temp.data){
					temp=temp.right;
				}
				else{
					temp=temp.left;
				}
			}

			if(temp.left==null && temp.right==null){
				if(parent.data>temp.data){
					parent.left=null;
				}
				else{
					parent.right=null;
				}
			}

			if(temp.left==null && temp.right!=null){
				temp=temp.right;
				if(temp.data>parent.data){
					parent.right=temp;
				}
			}

			if(temp.right==null && temp.left!=null){
				temp=temp.left;
				if(temp.data<parent.data){
					parent.left=temp;
				}
			}

			if(temp.left!=null && temp.right!=null){
				Node t=inorderSuccesor(temp);
				temp.data=t.data;
			}
		}
	}
}