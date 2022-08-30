package chapter08;
import javax.swing.*;
import java.awt.*;


/**
 * Escreva uma descrição da classe UsingImages aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class UsingImages implements Runnable
{
    public void run(){
        JFrame f = new JFrame("Some text examples");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container pane = f.getContentPane();
        JPanel p = new JPanel();
        String path1 = "\\resources\\image1.png";
        java.net.URL imgURL1 = UsingImages.class.getResource(path1);
        ImageIcon icon1 = new ImageIcon(imgURL1);
        JButton b1 = new JButton("",getImageSize(icon1, 150, 150));
        b1.addActionListener((e) -> showMessage(f));
        p.add(b1);
        //create an image for the JLabel
        String path2 = "\\resources\\image2.png";
        java.net.URL imgURL2 = UsingImages.class.getResource(path2);
        ImageIcon icon2 = new ImageIcon(imgURL2);
        JLabel k1 = new JLabel("",getImageSize(icon2,150,150),JLabel.CENTER);
        p.add(k1);
        f.add(p);
        f.pack();
        f.setVisible(true);
    }
    
    /**
     * Customizei esse método para permitir redimensionar a imagem
     */
    private ImageIcon getImageSize(ImageIcon imgIcon, int w, int h ){
        Image img1 = imgIcon.getImage();
        Image imgTemp = img1.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return new ImageIcon(imgTemp);        
    }
    
    public void showMessage(JFrame f){
        JOptionPane.showMessageDialog(f, "It's a nice button");
    }
    
    public static void main(String[] args){
        UsingImages i = new UsingImages();
        SwingUtilities.invokeLater(i);
    }
}
