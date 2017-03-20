package firstasignment;

import java.util.ArrayList;
import java.util.List;

public class GroupOfPersons
{

	public ArrayList<IAgeingEntity> persons = new ArrayList<IAgeingEntity>();

	public void addTo(String name,int ani,int luni,int zile)
	{
		Age ag= new Age(ani,luni,zile);
		Person pers=new Person(name,ag);
		persons.add(pers);
	}

	public IAgeingEntity getOldest()
	{
		// TODO Auto-generated method stub
		IAgeingEntity oldest = persons.get(0);
		for (IAgeingEntity person : persons)
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
		for (IAgeingEntity person : persons)
		{
			if(person.isOlderThan(age))
			{
				result.add(person);
			}
		}
		return result;
	}
}