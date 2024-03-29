
package Model;
public class MainModel {
    private int nRigheColonne=5;
    private char lettere[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private Pulsante Board[][] = new Pulsante[nRigheColonne][nRigheColonne];
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
                System.out.println("IJ : "+i+"-"+j);
                Board[i][j].setCarattere(lettere[nCasuale]);
                Board[i][j].setX(j);
                Board[i][j].setY(i);
            }
        }
    }

    public void stampaBoard(){
        for(int i=0; i<nRigheColonne; i++)
        {
            for(int j=0; j<nRigheColonne; j++)
            {
                System.out.print(this.Board[i][j].getCarattere()+" ");
            }
            System.out.println("");
        }
    }

    public boolean isPrimoCaratterePresente(char x){
        for(int i=0;i<nRigheColonne;i++){
            for(int j=0; j<nRigheColonne; j++){
                if(this.Board[i][j].getCarattere()==x){
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isParolaTrovata(String x){
        if(isPrimoCaratterePresente(x.charAt(0))){
            posizioniCaratteri[this.contatoreParola++][0]=this.Board[0][0].getY(); //ordinata del primo carattere
            posizioniCaratteri[this.contatoreParola++][1]=this.Board[0][0].getX(); //ascissa del primo carattere
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

    public Pulsante[][] getBoard(){
        return this.Board;
    }
}