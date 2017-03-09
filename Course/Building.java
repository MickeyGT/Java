import java.util.*;

public class Building extends Entity
{

	public Building(int years,int months,int days, String name)
	{
		super(years, months, days, name);
	}

	@Override
	public String toString()
	{
		return "Building{"+"age="+ years +", Address ='"+name+'\''+"}";
	}
	
}