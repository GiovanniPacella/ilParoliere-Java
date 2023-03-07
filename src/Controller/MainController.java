package Controller;

import View.PROVA;
import Model.MainModel;
import javax.swing.*;

import java.lang.Math;
public class MainController {
    public static MainModel model=new MainModel();
    public static String[][] recuperaMatrice()
    {
        String[][] matriceLettere = new String[5][5];
        model.creaBoard();
        return matriceLettere;
    }
    public static void main(String[] args)
    {


        PROVA p=new PROVA();
        p.setContentPane(p.getPanelMain());
        p.setVisible(true);
        p.setSize(800, 600);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[][] matriceLettere = new String[5][5];
        matriceLettere=recuperaMatrice();

    }

}