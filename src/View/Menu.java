package View;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    private JRadioButton RadioButton;

    public JRadioButton getRadioButton() {
        return RadioButton;
    }

    public void setRadioButton(JRadioButton radioButton) {
        RadioButton = radioButton;
    }

    private JPanel PanelMain;

    public JPanel getPanelMain() {
        return PanelMain;
    }

    public JButton getButton1() {
        return bottoneGioca;
    }

    public JButton getButton2() {
        return bottoneExit;
    }

    private JButton bottoneGioca;
    private JButton bottoneExit;
    private JButton bottoneClassifica;

    public Menu() {
        setLocationRelativeTo(null);
        pack();
        PanelMain.setSize(800,400);
        Insets m = new Insets(20,20,20,20);
        bottoneExit.addActionListener(e -> System.exit(0));
        //bottoneGioca.addActionListener(e -> );

    }

    private void createUIComponents() {
        // TODO: place custom component creation code he
    }
}
