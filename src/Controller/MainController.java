package Controller;

import View.PROVA;
import Model.MainModel;
import javax.swing.*;
import java.sql.Connection;

import java.lang.Math;
public class MainController {
    public static MainModel model=new MainModel();
    public static boolean isInDatabase(String parola){
        DBConnection connDB = new DBConnection();
        Connection connection = connDB.getConnessione();
        String sql="SELECT Parole FROM paroledizionariogpo WHERE Parole='"+parola+"';";
        if(connDB.QueryGenerica(connection, sql)){return true;}
        return false;
    }

    public static void main(String[] args)
    {
        PROVA p=new PROVA();
        p.setContentPane(p.getPanelMain());
        p.setVisible(true);
        p.setSize(800, 600);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        char[][] matriceLettere = new char[5][5];
        model.creaBoard();
        matriceLettere=model.getBoard();

        /*String parola = casellaTesto.getText();
        if(isInDatabase(parola) && model.isParolaTrovata(parola)){

        }else{

        }*/

    }

}