import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	MyFrame(){
	this.setTitle("JFrame title goes here"); //Titulo de frame
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
	this.setResizable(false); //prevent frame from being resized
	this.setSize(420,420); // sets the x-dimensions, and Y - dimensions of frame
	this.setVisible(true); //make frame visible
	
	JPanel panel = new JPanel(); //Crea un panel
	this.add(panel); //Agrega el panel al frame

	
	ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
	JLabel label = new JLabel("<html><img src=\"https://picsum.photos/200\"></html>");
	panel.add(label); //Crea un JLabel con el ImageIcon
	
	this.setIconImage(image.getImage());// change icon of frame
	this.getContentPane().setBackground(new Color(0,255,0)); //Change color of background
	
	}	
}
