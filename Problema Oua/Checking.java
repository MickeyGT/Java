
public class Checking
{
    static int nrLinii;

    static void setNr(int nr)
    {
        nrLinii=nr;
    }

    public static int isEqualToN(int nr)
    {
        return Boolean.compare((nr==nrLinii),false);
    }
    public static int isEqualTo1(int nr)
    {
        return Boolean.compare((nr==1),false);
    }
}
