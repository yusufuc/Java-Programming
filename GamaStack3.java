import java.util.Scanner;
class GamaStack3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int yr=sc.nextInt();
		if(yr<5000 && yr>0)
		{
		String onesArr[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String tensArr2[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String hunsArr3[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String thousArr4[]={"","M","MM","MMM","MMMM"};
		String last="";
		String slast="";
		String tlast="";
		String flast=" ";
		
		int ones=yr%10;
		if(ones >0 && ones<10)
		last=onesArr[ones];
		
		int tens=((yr%100)-(yr%10))/10;
		if(tens>0 && tens<10)
		slast=tensArr2[tens];
	
        int huns=((yr%1000)-(yr%100))/100; 
		if(huns>0 && huns<10)		
		tlast=hunsArr3[huns];
		
		int thous=(((yr%10000)-(yr%1000))/1000);
		if(thous>0 && thous<5)
		flast=thousArr4[thous];
		
		System.out.println(flast+""+tlast+""+slast+""+last);
	}
	else
	System.out.println("This is cannot be expressed in roman format");
}
}