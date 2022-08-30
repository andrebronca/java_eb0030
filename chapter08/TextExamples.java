package chapter08;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
 * Escreva uma descrição da classe TextExamples aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TextExamples implements Runnable
{
    public void run(){
        JFrame f = new JFrame("Some text examples");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        JPanel p = new JPanel();
        JTextField t1 = new JTextField(20);
        t1.addActionListener((e) -> textAction1(f, t1.getText()));
        JTextArea t2 = new JTextArea(5,20);
        JScrollPane scrollPane = new JScrollPane(t2);
        scrollPane.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        t2.setEditable(true);   //true by default
        t2.setText("Some text \non several lines");
        p.add(t1);
        p.add(scrollPane); //scrollPane already has t2
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
    
    public void textAction1(JFrame f, String text){
        JOptionPane.showMessageDialog(f, text);
    }
    
    public static void main(String[] args){
        TextExamples t = new TextExamples();
        SwingUtilities.invokeLater(t);
    }
}
