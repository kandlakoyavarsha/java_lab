import java.util.*;
//power operator doesnt work
class calc
{
public static void main(String[]args)
{
float a,b,r;
int c;
Scanner sc=new Scanner(System.in);
System.out.println("enter values for two operands");
a=sc.nextFloat();
b=sc.nextFloat();
System.out.println("Select an option 1.Add 2.Sub 3.Mul 4.Div 5.modulo 6.pow");
c=sc.nextInt();
switch(c){
case 1:
r=a+b;
System.out.println(r);
break;
case 2:
r=a-b;
System.out.println(r);
break;
case 3:
r=a*b;
System.out.println(r);
break;
case 4:
r=a/b;
System.out.println(r);
break;
case 5:
System.out.println(a%b);
case 6:
r=a^b;
System.out.println(r);
default:
System.out.println("enter a valid input");
break;
}


}}
