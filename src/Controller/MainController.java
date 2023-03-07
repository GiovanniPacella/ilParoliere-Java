package Controller;

import View.PROVA;

import javax.swing.*;

import java.lang.Math;
public class MainController {
    public static void main(String[] args) {


        PROVA p=new PROVA();
        p.setContentPane(p.getPanelMain());
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}