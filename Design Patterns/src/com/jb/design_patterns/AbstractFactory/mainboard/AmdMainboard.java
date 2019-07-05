package com.jb.design_patterns.AbstractFactory.mainboard;



public class AmdMainboard implements Mainboard {

	private int holes = 0;
	
	@Override
	public void getHoles() {
		System.out.println("AMD 主板的针孔数为:   " + holes);
	}
	
	public AmdMainboard(int holes) {this.holes = holes;}

}
