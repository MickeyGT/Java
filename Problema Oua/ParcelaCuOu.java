
public class ParcelaCuOu implements IParcela
{
	private int nrPoints;
	public ParcelaCuOu(int points) 
	{
		nrPoints=points;
	}

	@Override
	public int act()
	{
		return nrPoints;
	}
}
