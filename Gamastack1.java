import java.util.*;
import java.lang.Math;
class Gamastack1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	int arr[][]=new int [n][n];
	int sum1=0;
	int sum2=0;
	
	System.out.println("Give the input");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Elements entered are : ");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			sum1=sum1+arr[i][j];
			
			if((i+j)==(n-1))
			{
				System.out.println(arr[i][j]);
			sum2=sum2+arr[i][j];
			}
		}
	}
	System.out.println("Sum of first diagnol" +sum1);
	System.out.println("Sum of second diagnol" +sum2);
	System.out.println("Difference of the diagnol is" + Math.abs(sum1-sum2));
}
}
	
	