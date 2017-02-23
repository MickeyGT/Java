
public class Person
{
	private int age;
	private String name;
	private int sed;

	public Person(int age, String name)
	{
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Person{"+"age="+age+", name='"+name+'\''+", sed="+sed+'}';
	}
}
