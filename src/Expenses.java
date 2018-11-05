//importing libraries 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Expenses extends JFrame{
	//going to create properties for the class
	private JButton exp; //the expense button
	private JLabel expLabel; //the label for the expense button
	private JPanel mainPanel; //going to be the main panel for the app
	CardLayout cardLayout; //will be using a cardlayout
	private final int WIDTH = 500; //will be used for set size
	private final int HEIGHT = 500;
	//constructor
	public Expenses()
	{
		//title of the gui
		super("Expenses App");
		//set the size of the frame
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(cardLayout);
		
		
	}

}
