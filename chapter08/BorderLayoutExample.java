package chapter08;
import java.awt.*;
import javax.swing.*;

/**
 * Escreva uma descrição da classe BorderLayoutExample aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class BorderLayoutExample implements Runnable
{
    public void run(){
        JFrame f = new JFrame("BorderLayoutExample");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        //create a JPanel organised using BorderLayout
        JPanel p = new JPanel(new BorderLayout());
        //add a label to the centre panel
        JLabel l1 = new JLabel("The Centre", SwingConstants.CENTER);
        l1.setPreferredSize(new Dimension(100,100));
        p.add(l1, BorderLayout.CENTER);
        //add some buttons
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        p.add(b1, BorderLayout.NORTH);
        p.add(b2, BorderLayout.SOUTH);
        p.add(b3, BorderLayout.EAST);
        p.add(b4, BorderLayout.WEST);
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        BorderLayoutExample b = new BorderLayoutExample();
        SwingUtilities.invokeLater(b);
    }
}
