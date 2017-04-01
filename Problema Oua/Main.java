
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
    		   Pajiste.addEgg(x,y,points);
    	   }
       int nrIepuri = sc.nextInt();
       GroupOfRabbits Iepuri = new GroupOfRabbits();
       for(int i=1;i<=nrIepuri;i++)
       {
		   int x = sc.nextInt();
		   int y= sc.nextInt();
           Iepuri.addRabbit(x,y);
       }
       int nrOuaCulese=0,iepuriAfara=0;
       while(nrOuaCulese!=nrOua&&nrIepuri!=iepuriAfara)
       {
           Iepuri.makeNextMove();
       }
    }

}