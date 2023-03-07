package Controller;

import View.PROVA;

import javax.swing.*;

public class MainController {
    public static void main(String[] args) {

        PROVA p=new PROVA();
        p.setContentPane(p.getPanelMain());
        p.setTitle("Menu iniziale");
        p.setSize(800,600);
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}