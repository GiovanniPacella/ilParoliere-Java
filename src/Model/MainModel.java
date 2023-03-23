
package Model;
public class MainModel {
    private int nRigheColonne=5;
    private char lettere[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char Board[][] = new char[nRigheColonne][nRigheColonne];
    private String parolaTrovata;

    private int [][] posizioniCaratteri = new int [25][2];


    public MainModel(){}


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
    }

    public void stampaBoard(){
        for(int i=0; i<nRigheColonne; i++)
        {
            for(int j=0; j<nRigheColonne; j++)
            {
                System.out.print(this.Board[i][j]+" ");
            }
            System.out.println("");
        }
    }


    public void aggiungiCarattereParola(char x){
        this.parolaTrovata+=x;
    }

    public boolean isParolaTrovata(String x){
        if(x==this.parolaTrovata){
            return true;
        }
        return false;

    }

    public boolean verificaCarattere(char x){
        if((x+1)>nRigheColonne){
            return true;
        }
        return false;
    }

    public void setParolaTrovata(String parolaTrovata) {
        this.parolaTrovata = parolaTrovata;
    }

    public char[][] getBoard(){
        return this.Board;
    }
}