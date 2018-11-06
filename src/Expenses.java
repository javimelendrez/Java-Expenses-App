//importing libraries 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; //needed for linked list

public class Expenses extends JFrame implements ActionListener{
	//going to create properties for the class
	private JButton exp; //the expense button
	//private JLabel expLabel; //the label for the expense button
	private JPanel mainPanel; //going to be the main panel for the app
	CardLayout cardLayout = new CardLayout(); //will be using a cardlayout
	private final int WIDTH = 200; //will be used for set size
	private final int HEIGHT = 500;
	private JPanel createPanel; //this is the create expense panel
	private JLabel vendor; //the label for the vendor
	private JTextField vendorField; //the text field for the vendor
	private JLabel accountLabel; //label for the account text field
	private JTextField accountField; //text field for the account
	private JLabel amountLabel; //label for the amount
	private JTextField amountField; //text field for the amount
	private JButton saveNclose; //button to save the text fields and return to main panel
	//going to create data structures to hold info
	LinkedList<String> accountSummary = new LinkedList<String>();
	
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
		accountLabel = new JLabel("Account");
		accountField = new JTextField(12);
		amountLabel = new JLabel("Amount");
		amountField = new JTextField(12);
		saveNclose = new JButton("Save and Close");
		//add action listeners to the button
		exp.addActionListener(this);
		saveNclose.addActionListener(this);
		//add to main panel and set layout
		mainPanel.setLayout(new FlowLayout());
		mainPanel.add(exp);
		//add the main panel to the cardlayout
		add(mainPanel, "Main Panel");

		//add to create panel
		createPanel.setLayout(new FlowLayout());
		createPanel.add(vendor);
		createPanel.add(vendorField);
		createPanel.add(accountLabel);
		createPanel.add(accountField);
		createPanel.add(amountLabel);
		createPanel.add(amountField);
		createPanel.add(saveNclose);
		add(createPanel, "Create Panel");

		
		//set visible
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//create object source
		Object source = e.getSource();
		//if user click button it will take them to the next page
		if(source == exp)
		{
			cardLayout.show(getContentPane(), "Create Panel");
		}
		//if the user clicks on save and close return to main panel
		if (source == saveNclose)
		{
			cardLayout.show(getContentPane(), "Main Panel");
			accountSummary.add(vendorField.getText()+" "+accountField.getText()+" "+amountField.getText());
			System.out.println(accountSummary);
			vendorField.setText("");
			accountField.setText("");
			amountField.setText("");
			
		}
		//get the string of the fields

	}

}
