import java.util.*;
class GammaStack2{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		System.out.println("Enter the size of array");
		int count=0;
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		
		System.out.println("Entering the inputs");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=rn.nextInt(2);
			}
		}
		
		System.out.println("The element in of array is");
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]);
			  if(arr[i][j]==0)
				count++;
			
			}
			System.out.println();
		}
		System.out.println("Total zero elements are : "+ count);
		
	}
}