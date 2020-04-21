package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnderConstruction {
    public JPanel panelu;
    private JLabel under;
    private JButton button1;

    public UnderConstruction() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelu.setVisible(false);
                JFrame frame=new JFrame("Application");
                JPanel panel=new Application().panel1;
                frame.setContentPane(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
