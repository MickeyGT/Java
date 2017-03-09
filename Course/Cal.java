
public class Cal extends Entity 
{

	public Cal(int years,int months,int days, String name)
	{
		super(years, months, days, name);
	}
	public String toString()
	{
		return "Cal {"+"age="+ years +" Absolut age="+getAge()+", Name ='"+name+'\''+"}";

	}
	public int getAge()
	{
		int varAbs=0;
		for(int i=1;i<=5&&i<=years;i++)
			varAbs+=1;
		for(int i=6;i<=10&&i<=years;i++)
			varAbs+=2;
		for(int i=11;i<=years;i++)
			varAbs+=3;
		return varAbs;
	}
}
