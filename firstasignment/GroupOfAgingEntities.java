package firstasignment;

import java.util.ArrayList;
import java.util.List;

public class GroupOfAgingEntities
{

	public ArrayList<IAgeingEntity> AgingEntities = new ArrayList<IAgeingEntity>();

	public void addPersonTo(String name,int ani,int luni,int zile)
	{
		Age ag= new Age(ani,luni,zile);
		Person pers=new Person(name,ag);
		AgingEntities.add(pers);
	}

	public void addBuidlingTo(String name,int ani,int luni,int zile)
	{
		Age ag= new Age(ani,luni,zile);
		Building build =new Building(name,ag);
		AgingEntities.add(build);
	}


	public IAgeingEntity getOldest()
	{
		// TODO Auto-generated method stub
		IAgeingEntity oldest = AgingEntities.get(0);
		for (IAgeingEntity person : AgingEntities)
		{
			if (person.isOlderThan(oldest))
			{
				oldest = person;
			}
		}
		return oldest;
	}

	public ArrayList<IAgeingEntity> olderThan(IAge age)
	{
		// TODO Auto-generated method stub
		ArrayList<IAgeingEntity> result = new ArrayList<IAgeingEntity>();
		for (IAgeingEntity person : AgingEntities)
		{
			if(person.isOlderThan(age))
			{
				result.add(person);
			}
		}
		return result;
	}
}