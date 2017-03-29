
public class Iepure
{
    // Directii:
    // Nord = 1.
    // Est = 2.
    // Sud = 3.
    // Vest = 4.
    int x,y,nrTricou,directie,valCos;
    Iepure(int coordX,int coordY,int side,int nrTric)
    {
        x=coordX;
        y=coordY;
        nrTricou=nrTric;
        switch(side)
        {
            case 1:
                directie=1;
                break;
            case 2:
                directie =3;
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
        switch(directie)
        {
            case 1:
                x--;
        }
        valCos+=Matrix.matrx[x][y];
        Matrix.matrx[x][y]=0;
    }
}
