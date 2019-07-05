package com.jb.design_patterns.AbstractFactory.SimpleFactory;

public class Client {
	
	public static void main(String[] args) {
		ComputerEngineer c = new ComputerEngineer();
		
		c.makeComputer(1, 2);
		
	}
	

}
