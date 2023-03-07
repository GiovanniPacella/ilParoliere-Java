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

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public PROVA() {

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
