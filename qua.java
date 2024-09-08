import java.util.*;
class qua
{
public static void main(String[]args)
{
int a,b,c,d;
double x,y;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=(b*b)-(4*a*c);
System.out.println("roots are");
x=(-b+(Math.sqrt(d)))/(2*a);
y=(-b-(Math.sqrt(d)))/(2*a);
System.out.println(x);
System.out.println(y);
}}
