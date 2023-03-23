
package Model;
public class MainModel {
    private int nRigheColonne=5;
    private char lettere[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char Board[][] = new char[nRigheColonne][nRigheColonne];
    private String parolaTrovata;

    private int [][] posizioniCaratteri = new int [25][2];
    private int contatoreParola=0;


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

    public boolean isPrimoCaratterePresente(char x){
        for(int i=0;i<nRigheColonne;i++){
            for(int j=0; j<nRigheColonne; j++){
                if(this.Board[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isParolaTrovata(String x){
        if(isPrimoCaratterePresente(x.charAt(0))){
            //posizioniCaratteri[this.contatoreParola++][0]=getY(); ordinata del primo carattere
            //posizioniCaratteri[this.contatoreParola++][1]=getX(); ascissa del primo carattere
            for(int i=1;i<x.length();i++){ // Controllo
                if(!verificaCarattere(x.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    public boolean verificaCarattere(char x){
        //DA COMPLETARE
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