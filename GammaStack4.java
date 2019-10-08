import java.util.*;
class GammaStack4
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students going to vote");
	int n=sc.nextInt();
	int arr[]=new int [n];
	
	System.out.println("Start entering the votes");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	System.out.println("votes are...");
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+",");
		
	}
	
	int count[]=new int [6];
	for(int i=0;i<n;i++)
	{
	if(arr[i]>0 && arr[i]<6)
		count[arr[i]]++;
	else
		count[0]++;
	}
	
	System.out.println("Printing the votes");
	for(int i=1;i<6;i++)
	{
		System.out.println(i+"---->"+count[i]);
	}			
	System.out.println("Invalid votes---->"+count[0]);
}
}