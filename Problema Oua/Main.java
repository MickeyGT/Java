

import java.util.*;

public class Main
{
	
    public static void main(String[] args)
    {
       Matrix Ex = new Matrix();
       Scanner sc = new Scanner(System.in);
       int l= sc.nextInt();
       int p= sc.nextInt();
       for(int i=1;i<=p;i++)
    	   {
    		   int x = sc.nextInt();
    		   int y= sc.nextInt();
    		   int points = sc.nextInt();
    		   Ex.matrx[x][y]=points;
    	   }
       int nrIepuri = sc.nextInt();
       for(int i=1;i<=nrIepuri;i++)
       {
		   int x = sc.nextInt();
		   int y= sc.nextInt();
		   
       }
    }

}