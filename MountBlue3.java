import java.util.Scanner;
class MountBlue3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of times the number should be left shifted");
int n=sc.nextInt();
int arr[]=new int[5];
System.out.println("Enter the array");
for(int k=0;k<arr.length;k++)
{
	arr[k]=sc.nextInt();
}

int t=0;
for(int i=0;i<n;i++)
{
t=arr[0];
for(int j=0;j<arr.length;j++)
{
	if(j>0)
	{
		arr[j-1]=arr[j];
		
	}
}
arr[arr.length-1]=t;	
}
for(int k=0;k<arr.length;k++)	
System.out.print(arr[k]+" ");
}
}