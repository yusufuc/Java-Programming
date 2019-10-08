import java.util.Scanner;
class GammaStack5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string :");
String st=sc.nextLine();

char arr[]=new char[st.length()];
arr=st.toCharArray();
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]);

System.out.println("Enter the string you want to delete");
String del=sc.nextLine();
char dArr[]=new char[del.length()];
dArr=del.toCharArray();

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<dArr.length;j++)
	{
		while(i<arr.length && j<dArr.length && arr[i]==dArr[j])
		{
			i++;
			j++;
		}
		
	}
	System.out.print(arr[i]);
}
}
}