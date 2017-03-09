import java.util.*;
public class Person extends Entity
{

	public Person(int years,int months,int days, String name)
	{
		super(years, months, days, name);
	}

	@Override
	public String toString()
	{
		return "Person{"+"age="+ years +", name='"+name+'\''+"}";
	}
}