//importing libraries 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Expenses extends JFrame{
	//going to create properties for the class
	private JButton exp; //the expense button
	//private JLabel expLabel; //the label for the expense button
	private JPanel mainPanel; //going to be the main panel for the app
	CardLayout cardLayout = new CardLayout(); //will be using a cardlayout
	private final int WIDTH = 500; //will be used for set size
	private final int HEIGHT = 500;
	private JPanel createPanel; //this is the create expense panel
	private JLabel vendor; //the label for the vendor
	private JTextField vendorField; //the text field for the vendor
	
	//constructor
	public Expenses()
	{
		//title of the gui
		super("Expenses App");
		//set the size of the frame
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(cardLayout);
		
		//initialize
		exp = new JButton("Create Expense");
		//expLabel = new JLabel("");
		mainPanel = new JPanel();
		//cardLayout = new CardLayout();
		createPanel = new JPanel();
		vendor = new JLabel("Vendor");
		vendorField = new JTextField(12);
		

		//add to main panel and set layout
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(exp);
		//add the main panel to the cardlayout
		add(mainPanel, "Main Panel");

		//add to create panel
		createPanel.setLayout(new FlowLayout());
		createPanel.add(vendor);
		createPanel.add(vendorField);
		add(createPanel, "Create Panel");

		
		//set visible
		setVisible(true);
	}

}
