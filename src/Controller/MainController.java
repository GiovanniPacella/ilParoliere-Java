package Controller;

import Model.Pulsante;
import View.Menu;
import Model.MainModel;
import javax.swing.*;
import java.sql.Connection;

import java.lang.Math;
public class MainController {
    public static MainModel model=new MainModel();

    public static void main(String[] args)
    {
        Menu p=new Menu();
        p.setContentPane(p.getPanelMain());
        p.setVisible(true);
        p.setSize(800, 600);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pulsante[][] matriceLettere = new Pulsante[5][5];
        model.creaBoard();
        matriceLettere=model.getBoard();

        /*String parola = casellaTesto.getText();
        if(isInDatabase(parola) && model.isParolaTrovata(parola)){

        }else{
            PAROLA NON TROVATA
        }*/

    }

}