import java.util.*;
public class Person extends Entity
{
	
	public Person(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Person{"+"age="+ age +", name='"+name+'\''+"}";
	}
}
