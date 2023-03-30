package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Pulsante;
import View.Menu;
import Model.MainModel;
import javax.swing.*;
import java.sql.Connection;

import java.lang.Math;
import java.sql.ResultSet;

public class MainController {
    public static MainModel model=new MainModel();

    public static void main(String[] args) throws SQLException {
        Menu p=new Menu();
        p.setContentPane(p.getPanelMain());
        p.setVisible(true);
        p.setSize(700, 500);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainModel modello = new MainModel();
        modello.creaBoard();
        Pulsante [][] matriceLettere=model.getBoard();
        modello.stampaBoard();

        /*String parola = casellaTesto.getText();
        if(isInDatabase(parola) && model.isParolaTrovata(parola)){

        }else{
            PAROLA NON TROVATA
        }*/
        String query = "SELECT parole from paroledizionariogpo WHERE Parole = 'casa'";
        DBConnection c = new DBConnection();
        ResultSet x = c.QuerySelect(c.getConnessione(), query);
        while(x.next())
        {
            System.out.println(x.getString("Parole"));
        }

    }

}