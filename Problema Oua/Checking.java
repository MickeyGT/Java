public class Checking
{
	static int nrLinii;

	static void setNr(int nr)
	{
		nrLinii = nr;
	}

	public static int isEqualToN(int nr)
	{
		if(nr == nrLinii)
			return 1;
		else
			return 0;
	}

	public static int isEqualTo1(int nr)
	{
		if(nr == 1)
			return 1;
		else
			return 0;
	}
}