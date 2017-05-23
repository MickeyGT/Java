public class Iepure
{
	// Directii:
	// Nord = 1.
	// Est = 2.
	// Sud = 3.
	// Vest = 4.
	int x, y, directie, valCos;

	Iepure(int coordX, int coordY, int side)
	{
		x = coordX;
		y = coordY;
		switch (side)
		{
		case 1:
			directie = 1;
			break;
		case 2:
			directie = 3;
			break;
		case 4:
			directie = 4;
			break;
		case 8:
			directie = 2;
			break;
		}
	}

	public void Advance()
	{
		jumpToNext(directie);
		int res= collectEgg(x, y);
		if(res>0)
			switchDirection();
		valCos+=res;
	}

	private int collectEgg(int x, int y)
	{
		return Pajiste.collect(x,y);
	}

	private void switchDirection() 
	{
		switch (directie) 
		{
		case 1:
			directie = 4;
			break;
		case 2:
			directie = 1;
			break;
		case 3:
			directie = 2;
			break;
		case 4:
			directie = 3;
			break;
		}
	}

	private void jumpToNext(int directie)
	{
		switch (directie)
		{
		case 1:
			x--;
			break;
		case 2:
			y++;
			break;
		case 3:
			x++;
			break;
		case 4:
			y--;
			break;
		}
	}

	public int removeIfOut()
	{
		return IsOut(x,y);
	}

	private int IsOut(int x, int y)
	{
		if(x)
	}
}