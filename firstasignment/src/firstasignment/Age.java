package firstasignment;

public class Age implements IAge
{
    private int years, months, days;

    @Override
    public String toString()
    {
        return "Age{" +
                "years=" + years +
                ", months=" + months +
                ", days=" + days +
                '}';
    }

    Age(int ani, int luni, int zile)
    {
        years=ani;
        months=luni;
        days=zile;
    }

    public boolean isGreaterThan(IAge varsta)
    {
        return !(varsta.isGreaterThan(years,months,days));
    }

    public boolean isGreaterThan(int ani, int luni, int zile)
    {
        if(years*365+months*30+days>ani*365+luni*30+zile)
            return true;
        else
            return false;
    }
}