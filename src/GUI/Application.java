package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    public JPanel panel1;
    private JButton cashierButton;
    private JButton buyingServiceButton;
    private JButton productButton;
    private JButton managerButton;

    /*private void createUIComponents() {
        button1=new JButton(new ImageIcon("cashier.png"));
    }*/
    /*private void createUIComponents() {
        button1=new JButton();
        ImageIcon cashimg=new ImageIcon("cashier.png");
        Image img=cashimg.getImage();
        Image newcashimg=img.getScaledInstance(button1.getWidth(),button1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newcashimg);
        button1.setIcon(image);

    }*/

    public Application() {
        cashierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                JFrame cashpage=new JFrame("CashierFrame");
                JPanel panel=new CashierFrame().panelc;
                cashpage.setContentPane(panel);
                cashpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cashpage.pack();
                cashpage.setVisible(true);

            }
        });

        managerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                JFrame upage=new JFrame("UnderConstruction");
                JPanel panel=new UnderConstruction().panelu;
                upage.setContentPane(panel);
                upage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                upage.pack();
                upage.setVisible(true);
            }
        });
        productButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                JFrame upage=new JFrame("UnderConstruction");
                JPanel panel=new UnderConstruction().panelu;
                upage.setContentPane(panel);
                upage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                upage.pack();
                upage.setVisible(true);
            }
        });
        buyingServiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                JFrame upage=new JFrame("UnderConstruction");
                JPanel panel=new UnderConstruction().panelu;
                upage.setContentPane(panel);
                upage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                upage.pack();
                upage.setVisible(true);
            }
        });
    }
}
