package chapter08.mvc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Classe estilo: view 
 * controller: não foi definida separadamente, há o tratamento de eventos aqui
 * Aplicando MVC para GUI
 * @author André
 * @version 1.0
 */
public class NumberAppGUI implements Runnable
{
    //An instance of Number app is required
    private NumberApp app;
   
    public NumberAppGUI(){
        //create an instance of NumberApp
        app = new NumberApp();
    }

    public void run(){
        JFrame f = new JFrame("Number app");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        JPanel p = new JPanel();
        JButton up = new JButton("Up");
        JButton down = new JButton("Down");
        JLabel label1 = new JLabel(app.getValueAsString());
        p.add(label1);
        up.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(app.incValue()){
                    label1.setText(app.getValueAsString());
                } else {
                    showWarning(f);
                }
            }
        });
        down.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(app.decValue()){
                    label1.setText(app.getValueAsString());
                } else {
                    showWarning(f);
                }
            }
        });
        p.add(up);
        p.add(down);
        //set the contentPane size
        pane.setSize(220, 100);
        p.setPreferredSize(new Dimension(240,120));
        //add the panel to the frame
        f.add(p);
        makeMenuBar(f);
        f.pack();
        f.setVisible(true);
    }
    
    public void showWarning(JFrame f){
        JDialog d = new JDialog(f, "Alert");
        d.setSize(100, 100);
        JLabel x = new JLabel("Range 0 to 10!");
        d.setLocation(250,100);
        d.add(x);
        d.setVisible(true);
    }
    
    public static void main(String[] args){
        NumberAppGUI gui = new NumberAppGUI();
        SwingUtilities.invokeLater(gui);
    }
    
    public void makeMenuBar(JFrame f){
        JMenuBar m = new JMenuBar();
        //set the menu bar for the frame f
        f.setJMenuBar(m);
        //create the "Options" menu
        JMenu optionsMenu = new JMenu("Options");
        //now add some items to the menu
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem quitItem = new JMenuItem("Quit");
        //now we add some listeners for the menu items
        aboutItem.addActionListener((e) -> showAbout(f));
        quitItem.addActionListener((e) -> System.exit(0));
        //add the items to the menu
        optionsMenu.add(aboutItem);
        optionsMenu.add(quitItem);
        //finally, add the menu to the menu bar
        m.add(optionsMenu);
    }
    
    public void showAbout(JFrame f){
        JOptionPane.showMessageDialog(f, "Studed by André \nEnjoy!" );
    }
}
