package com.jb.design_patterns.AbstractFactory.mainboard;

public class IntelMainboard implements Mainboard {

	private int holes;
	
	@Override
	public void getHoles() {
		System.out.println("Intel 主板的针孔数为:   " + holes);
	}
	
	public IntelMainboard(int holes) {this.holes = holes;}

}
