import java.util.*;
class perfect
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		int sum=0;
		int n=ip.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum) System.out.println("Perfect Number");
		else System.out.println("Not Perfect Number");
	}
}