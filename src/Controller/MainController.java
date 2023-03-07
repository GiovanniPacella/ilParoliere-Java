package Controller;

import View.PROVA;

import javax.swing.*;

import java.awt.*;
import java.lang.Math;
public class MainController {
    public static void main(String[] args) {


        PROVA p=new PROVA();
        p.setContentPane(p.getPanelMain());
        p.setVisible(true);
        p.getPanelMain().setSize(800,600);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize(800,600);
        /*Insets m = new Insets(20,20,20,20);
        p.getButton2().setMargin(  m);*/

    }

}