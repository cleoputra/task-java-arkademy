package tugasResto;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements BaseInterface {
	final double p_McnCheese=2.52;
	final double p_fries=1.89;
	final double p_sodas=1.25;
	final double p_burgers=3.25;
	

	private int burgers, fries, sodas, mcncheese, totalOrder;
	double totaltax;
	double total;
	double totalPay;
	
	Scanner input = new Scanner(System.in);
	ArrayList<Menu> order = new ArrayList<>();
	
	public Menu() {
		
	}
	
	public Menu(int burgers, int fries, int sodas, int mcncheese) {
		super();
		this.burgers = burgers;
		this.fries = fries;
		this.mcncheese = mcncheese;
		this.sodas = sodas;
	}

	public int getBurger() {
		return burgers;
	}
	
	public int getFries() {
		return fries;
	}
	
	public int getSodas() {
		return sodas;
	}
	
	public int getMcncheese() {
		return mcncheese;
	}
	
	//override print out
	@Override
	public void bilPay() {
		System.out.println("--- Print Ordered Menu ---");
		
		if(totalOrder != 0) {
			for(int i = 0; i < order.size(); i++) {
				System.out.println("\nOrder " + (i+1));
				System.out.println("Burger: " + order.get(i).getBurger());
				System.out.println("Fries: " + order.get(i).getFries());
				System.out.println("Happy Sodas: " + order.get(i).getSodas());
				System.out.println("Mc 'n Cheese: " + order.get(i).getMcncheese());
			}	
		}else {
			System.out.println("No Order Anything!");
		}
		
	}
	
	@Override
	public void printPay() {
		System.out.println("--- Print Ordered Menu ---");
		
		if(totalOrder != 0) {
			for(int i = 0; i < order.size(); i++) {
				System.out.println("\nPayment " + (i+1));
				double t_burge = order.get(i).getBurger() * p_burgers;
				double t_fries = order.get(i).getFries() * p_fries;
				double t_sodas = order.get(i).getSodas() * p_sodas;
				double t_mc = order.get(i).getMcncheese() * p_McnCheese;
				total = t_burge + t_fries + t_sodas + t_mc;
				System.out.println("Total Payment " + " $ " + total);
				//pajak
				totaltax = total * 0.1;
				totalPay = total + totaltax;
				System.out.println("Total Payment with Tax " + " $ " + totalPay);
				
			}	
		}else {
			System.out.println("No Order Anything!");
		}
		
	}
	
	//input
	public void menuInput() {
		System.out.println("--- Menu Input Order---");
		System.out.println("Number of Course		: ");
		
			System.out.println("Burgers --- $ 2.52 ");
			burgers = input.nextInt();
			System.out.println("Fries ---  $ 1.89 ");
			fries = input.nextInt();
			System.out.println("Mc 'n Cheese --- $2.52 ");
			mcncheese= input.nextInt();
			System.out.println("Happy Soda --- $1.25  ");
			sodas = input.nextInt();
			
			order.add(new Menu(burgers, sodas, fries, mcncheese));
			totalOrder = burgers + sodas + fries + mcncheese; 
		
		System.out.println();
		}
	

	

}
