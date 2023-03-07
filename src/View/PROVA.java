package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;

public class PROVA extends JFrame{
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
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public PROVA() {
        setLocationRelativeTo(null);
        pack();
        PanelMain.setSize(800,600);
        Insets m = new Insets(20,20,20,20);
        button2.setMargin(  m);
        button2.setText("Ciao");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code he
    }
}
