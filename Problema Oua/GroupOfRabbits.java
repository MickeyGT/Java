import java.util.*;

public class GroupOfRabbits
{
    ArrayList<Iepure> Iepuri = new ArrayList<Iepure>();

    public void addRabbit(int x,int y)
    {
        int nr=0;
        nr +=   Checking.isEqualTo1(x);
        nr += 2*Checking.isEqualToN(x);
        nr += 4*Checking.isEqualTo1(y);
        nr += 8*Checking.isEqualToN(y);
        Iepure iep= new Iepure(x,y,nr);
    }

    public void makeNextMove()
    {
        for(Iepure temp: Iepuri)
            temp.Advance();
    }
}
