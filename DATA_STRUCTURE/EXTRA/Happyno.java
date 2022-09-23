class Happyno{

static int isHappyno(int n){
	int sum=0;
	int rem=0;

  while(n>0){
      rem=n%10;
      sum=sum+(rem*rem);
      n=n/10;
   }

   return sum;	
}

public static void main(String[] args) {
	int n=56;
	int r=n;

	while(r!=1 && r!=4){
		r=isHappyno(r);
	}

	if(r==1)
		System.out.println(n+": is a happy number ");
	else
		System.out.println(n+": is not a happy number ");
}
}