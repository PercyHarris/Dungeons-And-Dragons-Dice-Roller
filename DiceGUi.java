package Dice;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


	

public class DiceGUi extends BaseDice implements ActionListener {
	JLabel label;
	JFrame frame;
	JPanel panel;
	JComboBox menu;
	JRadioButton numRolls1;
	JRadioButton numRolls2;
	JRadioButton numRolls3;
	
	public DiceGUi()  {
		
			String[] options = {"D4","D6","D8","D10","D12","D20"}; // options for JComboBox
			menu = new JComboBox<String>(options);
			numRolls1 = new JRadioButton("1 Dice",true); //Creates new JRadioButton
			numRolls2 = new JRadioButton("2 Dice");
			numRolls3 = new JRadioButton("3 Dice");
			JFrame frame = new JFrame();
			frame.setSize(300,300);
			
			JButton button = new JButton("Roll Dice"); // Creates button
			button.addActionListener(this);
			 label = new JLabel("You rolled a: "); // Creates Label
			
			panel = new JPanel();
			panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100)); // Sets Size of the panel
			panel.setLayout(new GridLayout(0,1));
			panel.add(button);
			panel.add(label);
			panel.add(menu);
			panel.add(numRolls1);
			panel.add(numRolls2);
			panel.add(numRolls3);
			
			ButtonGroup groupNumRolls = new ButtonGroup();
			groupNumRolls.add(numRolls1); // puts all the radioButtons in a group
			groupNumRolls.add(numRolls2);
			groupNumRolls.add(numRolls3);
			
			
			
			menu.addActionListener(this);
			numRolls1.addActionListener(this);
			numRolls2.addActionListener(this);
			numRolls3.addActionListener(this);
			
			
			frame.add(panel, BorderLayout.CENTER );
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Practice Gui");
			frame.pack();
			frame.setVisible(true);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DiceGUi();

	}

	@Override
	public void actionPerformed(ActionEvent e) { // For JComboBox
		// TODO Auto-generated method stub
		String name = e.getSource().getClass().toString();
		System.out.println(name);
		
		if (name.contains("JComboBox")) { // make it so that depending on the name the Actionlistenr responds
			System.out.println("e");
			JComboBox<String> menu = (JComboBox<String>)e.getSource();
			if (menu.getSelectedItem() == "D4") {
				this.setNumSides(4);
				
			} // End of D4 if Statement 
			if (menu.getSelectedItem() == "D6") {
				this.setNumSides(6);
				
			} // End of D6 is Statement 
			if (menu.getSelectedItem() == "D8") {
				this.setNumSides(8);
		
			} // End of D8 is Statement
			if (menu.getSelectedItem() == "D10") {
				this.setNumSides(10);
								
			} // End of D10 is Statement
			if (menu.getSelectedItem() == "D12") {
				this.setNumSides(12);
				
			} // End of 12 is Statement
			if (menu.getSelectedItem() == "D20") {
				this.setNumSides(20);
				
			} // End of D20 is Statement
		} // End of getSelecteditem Statement
		else if(name.contains("JButton")) {
			switch (this.getNumrolls()) { // checks the name of the object
			
			case 1:
				this.setRolledNum();
				label.setText("You Rolled a: " + this.getRolledNum1() + " ");
				break;
				
			case 2:
				this.setRolledNum();
				label.setText("You Rolled a: " + this.getRolledNum1() + ", " + this.getRolledNum2()+" Total: " +
			(this.getRolledNum1()+ this.getRolledNum2()));
				break;
			
			case 3:
				this.setRolledNum();
				label.setText("You Rolled a: " + this.getRolledNum1() + ", " + this.getRolledNum2() + ", " 
						+ this.getRolledNum3() +" Total: " + (this.getRolledNum1()+ this.getRolledNum2() + this.getRolledNum3()) );
				break;
				
			
			}

			
			
		}
		else if (name.contains("JRadioButton")) {
			if(numRolls1.isSelected()) {
				this.setNumrolls(1);
			}
			//end of if statement
			else if(numRolls2.isSelected()) {
				this.setNumrolls(2);
			}//end of if statement
			else if(numRolls3.isSelected()) {
				this.setNumrolls(3);
			}//end of if statement
		}//end of else if statement
		
		
		
	
		
	}
		
}


