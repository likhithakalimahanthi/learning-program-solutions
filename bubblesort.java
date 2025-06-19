 import java.util.*;
class bubblesort
{
public static void main(String a[])
{
int a[],i,n,j;
Scanner s=new Scanner(System.in);
System.out.println("enter num of elements");
n=s.nextInt();
a=new int[n];
System.out.println("enter" +n+ "elements");
for(i=0;i<n,i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-1;j++);
{
if(a[j]>a[j+1]);
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}}}
System.out.println("sorting elements:");
for(i=0;i<n;i++)
System.out.println(a[i] + " ")
}
}