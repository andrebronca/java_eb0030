package chapter08;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * Implementando layout manager
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GridLayoutExample implements Runnable
{
    public void run(){
        JFrame f = new JFrame("GridLayoutExample");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        //create a JPanel organised using GridLayout
        //with a horizontal and vertial gap of 10
        JPanel p = new JPanel(new GridLayout(3,3,10,10));
        //add a 3x3 grid of JLabels
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                //show position as (x,y)
                JLabel j = new JLabel("("+ x +","+ y +")"
                    , SwingConstants.CENTER);
                //add a border to the label
                Border b = BorderFactory.createLineBorder(Color.BLACK);
                j.setBorder(b);
                //add to the panel
                p.add(j);
            }
        }
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args){
        GridLayoutExample g = new GridLayoutExample();
        SwingUtilities.invokeLater(g);
    }
}
