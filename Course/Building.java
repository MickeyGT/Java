import java.util.*;

public class Building extends Entity
{
	
	public Building(int age, String name) {
		super(age, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString()
	{
		return "Building{"+"age="+ age +", Address ='"+name+'\''+"}";
	}

}
