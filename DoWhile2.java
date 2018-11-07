public class DoWhile2
{
	public static void main(String args[])
	{
		int a=0;
		int b=0;
		do
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
		a++;
		}
		while(a<=20);
		System.out.println("Wow, You printed all even numbers");
		do
		{
			if(b%2!=0)
			{
				System.out.println(b);
			}
		b++;
		}
		while(b<=20);
		System.out.println("Wow, You printed all odd numbers");
	}
}
