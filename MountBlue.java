import java.util.Scanner;
class MountBlue
{																					//yusuf ali ayan ali
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
char ch[]=st.toCharArray();
String s1="";
int large=0;
for(int j=0;j<ch.length;j++)
{	
	int k=j;
	while(k<ch.length && ch[k]!=' ')
	{
		k++;
	}
	if(k>large)
	large=k;
	j=k++;
}

for(int i=0;i<large;i++)
{
	for(int j=0;j<ch.length;j++)
	{	
		int k=j;
		s1="";
		while(k<ch.length && ch[k]!=' ')
		{
			s1=s1+""+ch[k];
			k++;
		}
		if(i<s1.length())
			System.out.print(s1.charAt(i)+" ");
		else
			System.out.print("  ");
		j=k++;
	}
	System.out.println();
}

}
}