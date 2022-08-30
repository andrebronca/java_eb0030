package chapter08;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Escreva uma descrição da classe TwoButtonsCentralisedControl aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TwoButtonsCentralisedControl implements Runnable
{
    //These elements need to be instance variable so they
    //are accessible throughout the class
    private JButton b1;
    private JButton b2;
    private JLabel label1;
    
    public void run(){
        //first create the JFrame window
        JFrame f = new JFrame("Two buttons");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        JPanel p = new JPanel();
        b1 = new JButton("Set to Yes");
        b2 = new JButton("Set to No");
        //create a place where we can put some text
        label1 = new JLabel("---");
        p.add(label1);
        //create the instance of the centralised listener
        CentralisedListener c = new CentralisedListener();
        //link the buttons to the listener
        b1.addActionListener(c);
        b2.addActionListener(c);
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        TwoButtonsCentralisedControl app = new TwoButtonsCentralisedControl();
        SwingUtilities.invokeLater(app);
    }

    //prefiro esse formato é mais clean
    private class CentralisedListener implements ActionListener
    {
        //implement the requirements of the ActionListener
        //interface - provide the actionPerformed() method
        public void actionPerformed(ActionEvent e){
            // interrogate e ...
            if (e.getSource() == b1){
                label1.setText("Yes");
            }
            else if (e.getSource() == b2){
                label1.setText("No");
            }
        }
    }
}