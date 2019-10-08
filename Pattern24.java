import java.util.Scanner;

class Pattern24
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of stars");
int n=sc.nextInt();
int sp=0;
int st=n;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==n-1||i==0 || j==0 || j==n-1 || i==n/2+1 || j==n/2+1)
System.out.print("* ");

else
System.out.print("  ");
}
System.out.println();
}
}
}
