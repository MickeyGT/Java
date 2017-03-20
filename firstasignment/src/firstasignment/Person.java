package firstasignment;

public class Person implements IAgeingEntity
{
	@Override
	public String toString()
	{
		return "Person{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}

	private IAge age;
	private String name;
	Person(String nume, IAge vr)
	{
		name=nume;
		age=vr;
	}
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