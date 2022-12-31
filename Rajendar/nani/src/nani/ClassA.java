package nani;

public class ClassA
{
	public static void mian(String[]args)
	{
		int num=123,rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		System.out.println("reverse of num is :"+rev);
		}
	}


