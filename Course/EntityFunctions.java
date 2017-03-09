import java.util.ArrayList;


public class EntityFunctions
{
	public Entity oldestEntity(ArrayList<Entity>vec)
	{
		Entity oldest = null;
		for(Entity e: vec)
		{
			if(oldest == null)
				oldest = e;
			else if(e.getAge()>oldest.getAge())
				oldest=e;
		}
		return oldest;
	}

	public ArrayList<Entity> olderEntityThan(ArrayList<Entity> vec,int givenage)
	{
		ArrayList<Entity> temp = new ArrayList<Entity>();

		for(Entity temporary: vec)
		{
				if(temporary.years > givenage)
						temp.add(temporary);

		}
		return temp;
	}

	public Entity oldestPerson(ArrayList<Entity> vec)
	{
		Entity oldest = null;

		for(Entity e: vec)
		{
			if(e instanceof Person)
			{
				if(oldest == null)
					oldest = e;
				else if(e.years>oldest.years)
					oldest=e;
			}
		}
		return oldest;
	}

	public ArrayList<Entity> olderPersonThan(ArrayList<Entity> vec,int givenage)
	{
		ArrayList<Entity> temp = new ArrayList<Entity>();

		for(Entity temporary: vec)
		{
			if(temporary instanceof Person)
				if(temporary.years>givenage)
					temp.add(temporary);
		}
		return temp;
	}

	public Entity oldestBuilding(ArrayList<Entity> vec)
	{
		Entity oldest = null;

		for(Entity e: vec)
		{
			if(e instanceof Building)
			{
				if(oldest == null)
					oldest = e;
				else if(e.years>oldest.years)
					oldest=e;
			}
		}
		return oldest;
	}

	public ArrayList<Entity> olderBuildingThan(ArrayList<Entity> vec,int givenage)
	{
		ArrayList<Entity> temp = new ArrayList<Entity>();

		for(Entity temporary: vec)
		{
			if(temporary instanceof Building)
				if(temporary.years>givenage)
					temp.add(temporary);
		}
		return temp;
	}

}