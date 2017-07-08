package Tree;

public class Sumofnum {
public static int b;
	public static void main(String[] args) {
		userMethod(1234);
		System.out.println(b);
	}
		private static void userMethod(int a) {
			// TODO Auto-generated method stub
			
int i=0,r=0,count=1,sum=0; 
while(a!=0) {
	r=a%10;
	a=a/10;
	i=count;
	while(i!=0) {
		sum=sum+r;
		i--;
	}
	count++;
}
b=sum;
	}
	
		
	}
	

