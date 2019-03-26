import java.util.*;
class Calculator
{
	int a,b;
	Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String args[])
	{
		int number1,number2;
		int sum,mul;
		float div;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number1");
		number1=in.nextInt();
		System.out.println("Enter Number2");
		number2=in.nextInt();
		Calculator c=new Calculator(number1,number2);
		sum=c.addition();
		mul=c.multiplication();
		div=c.division();
		System.out.println("addition of two numbers="+sum);
		System.out.println("multiplication of two numbers="+mul);
		System.out.println("division of two numbers="+div);
	}
	int addition()
	{
		return a+b;
	}
	int multiplication()
	{
		return a*b;
	}
	float division()
	{
		float b=this.b;
		return a/b;
	}
}