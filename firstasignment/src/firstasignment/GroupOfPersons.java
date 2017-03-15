package firstasignment;

import java.util.ArrayList;
import java.util.List;

public class GroupOfPersons
{

	List<IAgeingEntity> persons;
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

	public List<IAgeingEntity> olderThan(IAge age)
    {
		// TODO Auto-generated method stub
		List<IAgeingEntity> result = new ArrayList<IAgeingEntity>();
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
