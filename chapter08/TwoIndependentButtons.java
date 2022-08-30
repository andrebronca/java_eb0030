package chapter08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Escreva uma descrição da classe TwoIndependentButtons aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TwoIndependentButtons implements Runnable
{
    public void run(){
        JFrame f = new JFrame("Two buttons");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        JPanel p = new JPanel();
        JButton b1 = new JButton("Set -> Yes");
        JButton b2 = new JButton("Set -> No");
        JLabel label1 = new JLabel("---");
        p.add(label1);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label1.setText("Yes");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label1.setText("No");
            }
        });
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        TwoIndependentButtons app = new TwoIndependentButtons();
        SwingUtilities.invokeLater(app);
    }
}
