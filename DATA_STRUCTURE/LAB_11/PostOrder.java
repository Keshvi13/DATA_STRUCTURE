class Node{
	int value;
	Node left,right;

 Node(int a){
	value=a;
	left=right=null;
  }
}


class PostOrder{
	Node root;

	PostOrder(){
		root=null;
	}

	void postOrder(Node n){
		if(n==null){
			return;
		}
	    postOrder(n.left);
	    postOrder(n.right);
	    System.out.println(n.value);
	}

	 public static void main(String[] args) {
		PostOrder tree=new PostOrder();
	  tree.root=new Node(16);
   	  tree.root.right=new Node(20);
      tree.root.left=new Node(12);
      tree.root.left.left=new Node(11);
      tree.root.left.right=new Node(14);
      tree.root.left.right.left=new Node(13);
      tree.root.right.left=new Node(19);
      tree.postOrder(tree.root);
	}
}