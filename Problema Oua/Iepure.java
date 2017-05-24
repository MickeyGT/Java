public class Iepure
{
	// Directii:
	// Nord = 1.
	// Est = 2.
	// Sud = 3.
	// Vest = 4.
	int x, y, directie, valCos,nrDeOrdine;

	Iepure(int coordX, int coordY, int side,int number)
	{
		x = coordX;
		y = coordY;
		nrDeOrdine = number;
		switch (side)
		{
		case 1:
			directie = 3;
			break;
		case 2:
			directie = 1;
			break;
		case 4:
			directie = 2;
			break;
		case 8:
			directie = 4;
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
			directie = 2;
			break;
		case 2:
			directie = 3;
			break;
		case 3:
			directie = 4;
			break;
		case 4:
			directie = 1;
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

	public boolean removeIfOut(int nrLinii)
	{
		return IsOut(x,y,nrLinii);
	}

	private boolean IsOut(int x, int y,int nrLinii)
	{
		return x<=0||x>nrLinii||y<=0||y>nrLinii;

	}
}