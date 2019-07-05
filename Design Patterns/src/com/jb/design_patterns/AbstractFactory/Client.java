package com.jb.design_patterns.AbstractFactory;

import com.jb.design_patterns.AbstractFactory.factory.AbstractFactory;
import com.jb.design_patterns.AbstractFactory.factory.AmdFactory;
import com.jb.design_patterns.AbstractFactory.factory.IntelFactory;

public class Client {

	
	public static void main(String[] args) {
		ComputerEngineer engineer = new ComputerEngineer();
		
		AbstractFactory intelFactory = new IntelFactory();
		AbstractFactory amdFactory = new AmdFactory();
		
		engineer.makeComputer(amdFactory);
	}
	
}
