
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int nrLinii= sc.nextInt();
       Checking.setNr(nrLinii);
       int nrOua= sc.nextInt();
       for(int i=1;i<=nrOua;i++)
    	   {
    		   int x = sc.nextInt();
    		   int y= sc.nextInt();
    		   int points = sc.nextInt();
    		   Matrix.matrx[x][y]=points;
    	   }
       int nrIepuri = sc.nextInt();
       ArrayList<Iepure> Iepuri = new ArrayList<Iepure>();
       for(int i=1;i<=nrIepuri;i++)
       {
           int nr=0;
		   int x = sc.nextInt();
		   int y= sc.nextInt();
		   nr +=   Checking.isEqualTo1(x);
		   nr += 2*Checking.isEqualToN(x);
		   nr += 4*Checking.isEqualTo1(y);
           nr += 8*Checking.isEqualToN(y);
           Iepure iep= new Iepure(x,y,nr,i);
           Iepuri.add(iep);
           System.out.println(nr);
       }
       int nrOuaCulese=0,iepuriAfara=0;
       while(nrOuaCulese!=nrOua&&nrIepuri!=iepuriAfara)
       {
           for(Iepure temp : Iepuri)
           {
               temp.Advance();
           }

       }
    }

}