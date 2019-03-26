import java.util.*;
class InterestRate
{
	double principle,time,rate,compound;
	InterestRate(double principle,double time,double rate,double compound)
	{
		this.principle= principle;
		this.time=time;
		this.rate=rate;
		this.compound=compound;
		
	}
	public static void main(String args[])
	{
		double simple,p,r,t,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Principle amount");
		p=in.nextFloat();
		System.out.println("Enter rate of interest per year in decimal");
		r=in.nextFloat();
		System.out.println("Enter The number of yerrs money is borrowed");
		t=in.nextFloat();
		System.out.println("Enter The number of times the interest is compounded per year");
		c=in.nextFloat();
		InterestRate s=new InterestRate(p,t,r,c);
		System.out.println("Simple Interest = "+s.simpleInterest());
		System.out.println("Compound Interest = "+s.compoundInterest());
	}
	double simpleInterest()
	{
		
		return principle*(1+rate*time);
	}
	double compoundInterest()
	{
		
		return principle*(Math.pow((1+rate)/100,time));
	}
}