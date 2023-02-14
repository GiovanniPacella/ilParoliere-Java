package Model;

public class MainModel {
    private int nRigheColonne=5;
    private char lettere[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char Board[][] = new char[nRigheColonne][nRigheColonne];

    public void creaBoard()
    {
        for(int i=0; i<nRigheColonne; i++)
        {
            for(int j=0; j<nRigheColonne; j++)
            {
                int nCasuale= (int) (Math.random()*lettere.length);
                Board[i][j]=lettere[nCasuale];
            }
        }
        return;
    }
}