import java.util.*;
class pf{
public static void main(String[]args)
{
int a,b,c,i,j;
c=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=a;
for(i=2;i<=b;i++)
{
c=0;
	if(b%i==0)
	{
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
			c++;
			}
		}
		if(c==2)
		{
		System.out.println(i);
		}
	}
}

}
}
