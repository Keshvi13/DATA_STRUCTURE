import java.util.Scanner;
class Prefix1{
    int s[];
    int top;
    Prefix1(int n){
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

public class Prefix{
	public static void main(String[] args) {
		String prefix="/+33-+47*+123";
		Prefix1 ob =new Prefix1 (prefix.length()-1);
		for(int i=prefix.length()-1;i>=0;i--)
		{
			char ch=prefix.charAt(i);
          
			if(ch>=49 && ch<=57) //checking for digit
			  ob.push(ch-48);
			else
			{
				//2 opreands are being popped
				int p1=ob.pop();
				int p2=ob.pop();
				switch(ch){
					case'+':
					p2=p1+p2;
					break;

					case'-':
					p2=p1-p2;
					break;

					case'*':
					p2=p1*p2;
					break;

					case'/':
					  if(p2==0){
						System.out.println("cannot divied by ziro");
						break;
					  }
					p2=p1/p2;
					break;
					case'^':
					p2=(int)Math.pow(p2,p1);
				}
				ob.push(p2);
			}
		}
		System.out.println("prefix expression:"+ob.pop());
	}
}
