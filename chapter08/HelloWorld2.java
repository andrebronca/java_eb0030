package chapter08;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Escreva uma descrição da classe HelloWorld2 aqui.
 * 
 * @author André
 * @version 1.0
 */
public class HelloWorld2 extends JFrame
{
    public void HelloWorld2(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();
        JPanel p = new JPanel();
        JButton b = new JButton("You can press me!");
        JLabel label1 = new JLabel("Hello World!");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label1.setText("Well clicked!");
            }
        });
        p.add(label1);
        p.add(b);
        this.add(p);
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args){
        //create an instance of this class
        HelloWorld2 hw2 = new HelloWorld2();
        //constructor will now be invoked
    }
}
