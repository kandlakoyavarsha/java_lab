import java.util.*;
class pal
{
public static void main(String[]args)
{
int a,b,c,d,r;
r=0;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=a;
while(a!=0)
{
c=a%10;
r=(r*10)+c;
a=a/10;
}
if(b==r)
{
System.out.println("Given number is palindrome");}
else
{
System.out.println("Given number is not a palindrome");}
}}
