package Dice;

import java.util.Random;
import java.util.Scanner;


public class BaseDice  {
	private int numSides;
	private int rolledNum1;
	private int rolledNum2;
	private int rolledNum3;
	private Random num = new Random();
	private Scanner input = new Scanner(System.in);
	private int diceNum;
	private int numrolls;
	private int userRolls;
	
	
	
	
	public BaseDice() {
		numSides = 0;
		rolledNum1 = 0;
		rolledNum2 = 0;
		rolledNum3 = 0;
		numrolls = 1;
		userRolls = 1;
		
		
	}
	
	public int getNumSides() {
		return this.numSides;
	}
	
	public void setNumSides(int numSides) {
		this.numSides = numSides;
		
	}
	
	public int getRolledNum1() {
		return this.rolledNum1;
	}
	public int getRolledNum2() {
		return this.rolledNum2;
	}
	public int getRolledNum3() {
		return this.rolledNum3;
	}
	
	public void setRolledNum() {
		switch (this.getNumrolls()) {
		
		case 1:
			this.rolledNum1 = num.nextInt(this.numSides) + 1;
			break;
			
		case 2:
			this.rolledNum1 = num.nextInt(this.numSides) + 1;
			this.rolledNum2 = num.nextInt(this.numSides) + 1;
			break;
		
		case 3:
			this.rolledNum1 = num.nextInt(this.numSides) + 1;
			this.rolledNum2 = num.nextInt(this.numSides) + 1;
			this.rolledNum3 = num.nextInt(this.numSides) + 1;
			break;
			
		default:
			System.out.println("Enter Number shown");
			break;
			
		}
	}

	
	public void displayMenu() {
		System.out.println("Enter Dice Number(options are 4,6,8,10,12,20 or -1 to quit):");
		this.implementMenu();
	}
	public void displayMenu2() {
		System.out.println("Enter number of Dice you want to roll(1,2,3):");
		 this.userRolls = input.nextInt();
	}
	
	
	public void implementMenu() {
		new Random();
		
		diceNum = input.nextInt();
		
		switch(diceNum) {
		case 4:
			this.displayMenu2();
			this.setNumrolls(numrolls);
			this.setNumSides(4);
			this.setRolledNum();
			this.getNumrolls();
			this.printInfo();
			this.displayMenu();
			break;
			
		case 6:
			this.displayMenu2();
			this.setNumrolls(numrolls);
			this.setNumSides(6);
			this.setRolledNum();
			this.getNumrolls();
			this.printInfo();
			this.displayMenu();
			break;
			
		case 8:
			this.displayMenu2();
			this.setNumrolls(numrolls);
			this.setNumSides(8);
			this.setRolledNum();
			this.getNumrolls();
			this.printInfo();
			this.displayMenu();
			break;
		
		case 10:
			this.displayMenu2();
			this.setNumrolls(numrolls);
			this.setNumSides(10);
			this.setRolledNum();
			this.getNumrolls();
			this.printInfo();
			this.displayMenu();
			break;
		
		case 12:
			this.displayMenu2();
			this.setNumrolls(numrolls);
			this.setNumSides(12);
			this.setRolledNum();
			this.getNumrolls();
			this.printInfo();
			this.displayMenu();
			break;
			
		case 20:
			this.displayMenu2();
			this.setNumrolls(numrolls);
			this.setNumSides(20);
			this.setRolledNum();
			this.getNumrolls();
			this.printInfo();
			this.displayMenu();
			break;
			
		case -1:
			System.out.println("GoodBye");
			break;
			
		default:
			
			System.out.println("Enter Number shown");
			this.displayMenu();
			break;
		}
		
		
	}

	public int getNumrolls() {
		return numrolls;
	}
	public void printInfo() {
switch (this.getNumrolls()) {
		
		case 1:
			System.out.println("You Rolled a: " + this.getRolledNum1() + " ");
			break;
			
		case 2:
			System.out.println("You Rolled a: " + this.getRolledNum1() + ", " + this.getRolledNum2()+" Total: " +
		(this.getRolledNum1()+ this.getRolledNum2()));
			break;
		
		case 3:
			System.out.println("You Rolled a: " + this.getRolledNum1() + ", " + this.getRolledNum2() + ", " 
					+ this.getRolledNum3() +" Total: " + (this.getRolledNum1()+ this.getRolledNum2() + this.getRolledNum3()) );
			break;
			
		
		}
	}

	public void setNumrolls(int numrolls){
		this.numrolls = numrolls ;
		
	}
	

}
