import java.util.*;
class HouseConstruction
{
	int area;
	String meterialType;
	HouseConstruction(int area,String meterialType)
	{
		this.area=area;
		this. meterialType= meterialType;
	}
	public static void main(String args[])
	{
		int a;
		String m;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter meterial Type");
		m=in.nextLine();
		System.out.println("Enter area");
		a=in.nextInt();
		HouseConstruction h=new HouseConstruction(a,m);
		System.out.println("Cost for House Construction is ="+h.houseCost());
	}
	int houseCost()
	{
		if(meterialType.equalsIgnoreCase("standard material"))
		{
			return area*1200;
		}
		else if(meterialType.equalsIgnoreCase("above standard material"))
		{
			return area*1500;
		}
		else if(meterialType.equalsIgnoreCase("high standard material and fully automated"))
		{
			return area*2500;
		}
		else if(meterialType.equalsIgnoreCase("high standard material"))
		{
			return area*1800;
		}
		else
			return 0;
	}
}