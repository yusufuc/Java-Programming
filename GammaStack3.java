import java.util.*;
class GammaStack3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Eneter the Amount SAM has");
int amount=sc.nextInt();

System.out.println("Eneter the Cost of one bar");
int cost=sc.nextInt();

System.out.println("Enter the no. of wrapper required for one bar");
int n=sc.nextInt();

int countofBar=amount/cost;
int wrapper=countofBar;
while(wrapper>n-1)
{
	int bar=wrapper/n;
	wrapper=wrapper%n;
	wrapper=wrapper+bar;
	countofBar=countofBar+bar;
}
System.out.println("Bars : " +countofBar);
}
}

