package GUI;

import soft.DatabaseFunctions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashierFrame extends JFrame{
    private JButton selectFromCashierButton;
    private JButton deleteALLFromCashierButton;
    private JButton updateCashierButton;
    private JButton addCashierButton;
    public JPanel panelc;
    private JTextArea citire;
    private JTextArea afisare;
    private JButton backButton;

    public CashierFrame() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelc.setVisible(false);
                JFrame frame=new JFrame("Application");
                JPanel panel=new Application().panel1;
                frame.setContentPane(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }

        });
        selectFromCashierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseFunctions dataf=DatabaseFunctions.getInstance();
                String X=dataf.showCashiersGUI();
                afisare.setText(X);
            }
        });
        deleteALLFromCashierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afisare.setText("Stergerea a fost facuta cu succes!");
            }
        });
        updateCashierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Y=citire.getText();
                DatabaseFunctions dataf=DatabaseFunctions.getInstance();
                dataf.updateCashier(Y.charAt(0),Y.charAt(3));
                afisare.setText("Vanzatorul a fost updatat cu succes!");
            }
        });
        addCashierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afisare.setText("Not done yet!");
            }
        });
    }
}
