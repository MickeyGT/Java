
public class Pajiste 
{
	public static IParcela[][] matrx = new IParcela[51][2501];
	
	Pajiste(int n)
	{
		for(int i=1;i<=n;i++)
			matrx[0][i]=matrx[i][0]= matrx[n+1][i]=matrx[i][n+1]=new ParcelaExterior();
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				matrx[i][j]=new ParcelaFaraOu();
	}
	
	public static void addEgg(int x, int y, int points)
	{
		matrx[x][y]=new ParcelaCuOu(points);
	}

	public static void collect(int x, int y)
	{
		matrx[x][y].act();
	}


}
