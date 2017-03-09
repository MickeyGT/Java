import java.util.ArrayList;


public abstract class Entity
{
	protected int years,months,days;
	protected String name;

	public Entity(int years,int months,int days, String name)
	{
		this.years = years;
		this.months=months;
		this.days=days;
		this.name = name;
	}
	public int getAge()
	{
		return years*365+months*30+days;
	}
}