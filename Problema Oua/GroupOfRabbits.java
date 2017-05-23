import java.util.*;

public class GroupOfRabbits {
	ArrayList<Iepure> Iepuri = new ArrayList<Iepure>();

	public void addRabbit(int x, int y,int number) {
		int nr = 0;
		nr += Checking.isEqualTo1(x);
		nr += 2 * Checking.isEqualToN(x);
		nr += 4 * Checking.isEqualTo1(y);
		nr += 8 * Checking.isEqualToN(y);
		Iepure iep = new Iepure(x, y, nr,number);
		Iepuri.add(iep);
	}

	public void makeNextMove(int nrLinii)
	{
		for (Iepure temp : Iepuri)
		{
			if(temp.removeIfOut(nrLinii))
			{
				Iepuri.remove(temp);
				System.out.println("Rabbit"+temp.nrIndice+"has been deleted.");
			}
			else
			{
				System.out.println("Rabbit"+temp.nrIndice+"has advanced.");
				temp.Advance();
			}
		}
	}
}