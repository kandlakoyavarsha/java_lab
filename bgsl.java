import java.util.*;
class bgsl{
public static void main(String[]args)
{
int arr[]=new int[5];
int i,j;
Scanner sc=new Scanner(System.in);
for(i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
int min=arr[0];
int max=arr[0];
for(j=1;j<5;j++)
{
if(arr[j]<min)
{
min=arr[j];
}
}
for(j=1;j<5;j++)
{
if(arr[j]>max)
{
max=arr[j];
}
}
System.out.println("max is"+max+"and min is"+min);
}

}

