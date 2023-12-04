import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
MyFrame(){
	
	this.setTitle("Jthis title goes here"); //Titulo de this
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
	this.setResizable(false); //prevent this from being resized
	this.setSize(420,420); // sets the x-dimensions, and Y - dimensions of this
	this.setVisible(true); //make this visible
	
	ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
	this.setIconImage(image.getImage());// change icon of this
	this.getContentPane().setBackground(new Color(0,255,0)); //Change color of background
}

}
