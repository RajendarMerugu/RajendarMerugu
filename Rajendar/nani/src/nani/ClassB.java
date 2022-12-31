package nani;

public class ClassB
{
	public static void main(String[]args)
	{
		int num=153,rev=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev+(rem*rem*rem);
		}
		System.out.println("reverse of num is:"+rev);
		if(temp==rev)
		{
			System.out.println("your number is Armstrong number");
		}
		else
		{
			System.out.println("your number is not Armstrong number");
		}
	}

}
