public class Caine extends Entity
{
	public Caine(int years,int months,int days, String name)
	{
		super(years, months, days, name);
	}
	public String toString()
	{
		return "Caine {"+"age="+ years +" Absolut age="+getAge()+", Name ='"+name+'\''+"}";

	}
	public int getAge()
	{
		return 9*(years*365+months*30+days);
	}
}