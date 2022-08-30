package chapter08;
import java.awt.*;
import javax.swing.*;

/**
 * Escreva uma descrição da classe HelloWorld aqui.
 * 
 * @author André
 * @version 1.0
 */
public class HelloWorld implements Runnable
{
    public void run(){
        //first create the JFrame window (mentira, já criei outras :) )
        JFrame f = new JFrame("Our first Swing application"); 
        //determine what happens when the window is closed
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //fetch a reference to the JFrame's contentPane
        Container pane = f.getContentPane();
        //create a JPanel
        JPanel p = new JPanel();
        //create a button
        JButton b = new JButton("You can press me!");
        //create a place where we can put some text
        JLabel label1 = new JLabel("Hello World!");
        //add the button and the label to the panel
        p.add(label1);
        p.add(b);
        //add the panel to the frame
        f.add(p);
        //pack the frame ready for display
        f.pack();
        //make the frame visible
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        //create an instance of this class
        HelloWorld hw = new HelloWorld();
        //schedule the application to run
        SwingUtilities.invokeLater(hw);
    }
}
