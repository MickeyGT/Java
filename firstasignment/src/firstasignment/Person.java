package firstasignment;

public class Person implements IAgeingEntity
{

	private IAge age;
	private String name;
	
	@Override
	public boolean isOlderThan(IAgeingEntity other)
	{
		// TODO Auto-generated method stub
		if(other.isOlderThan(age))
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean isOlderThan(IAge age)
	{
		// TODO Auto-generated method stub
		if(this.age.isGreaterThan(age))
		{
		    return true;
		}
		return false;
	}
}
