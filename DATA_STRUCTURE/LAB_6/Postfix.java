import java.util.Scanner;
class Postfix1{
    int s[];
    int top;
    Postfix1(int n){
    	s=new int[n];
    	top=-1;
    }
    
    void push(int n){
		if(top==s.length-1){
			System.out.println("Stack Overflow Error");
		}
		else{
			top++;
			s[top]=n;
		}
	}
   
   int pop(){
   	    if(top==-1)
   	    	return '#';
   	    else{
   	    	return s[top--];
   	    }

   }

  
}

public class Postfix{
	public static void main(String[] args) {
		String post="546+*493/+*";
		Postfix1 ob =new Postfix1 (post.length());
		for(int i=0;i<post.length();i++)
		{
			char ch=post.charAt(i);
			if(ch>=49 && ch<=57) //checking for digit
			  ob.push(ch-48);
			else
			{
				//2 opreands are being popped
				int p1=ob.pop();
				int p2=ob.pop();
				switch(ch){
					case'+':
					p1=p2+p1;
					break;

					case'-':
					p1=p2-p1;
					break;
					

					case'*':
					p1=p2*p1;
					break;

					case'/':
					  if(p1==0){
						System.out.println("cannot divied by ziro");
						break;
					  }
					p1=p2/p1;
					break;
					case'^':
					p1=(int)Math.pow(p2,p1);
				}
				ob.push(p1);
			}
		}
		System.out.println("postfix expression:"+ob.pop());
	}
}
