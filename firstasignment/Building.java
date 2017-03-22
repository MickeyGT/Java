package firstasignment;

public class Building implements IAgeingEntity
{
    private Age ageOfBulding;
    String address;

    public Building(String address, Age ageOfBulding)
    {
        this.ageOfBulding = ageOfBulding;
        this.address = address;
    }

    public boolean isOlderThan(IAgeingEntity other)
    {
        if(other.isOlderThan(ageOfBulding))
        {
            return false;
        }
        return true;
    }
    public boolean isOlderThan(IAge varsta)
    {
        return varsta.isGreaterThan(ageOfBulding);
    }
}
