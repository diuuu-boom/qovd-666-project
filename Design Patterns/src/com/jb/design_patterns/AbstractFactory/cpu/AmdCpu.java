package com.jb.design_patterns.AbstractFactory.cpu;

public class AmdCpu implements Cpu {

	private int pins = 0;
	
	@Override
	public void getPins() {
		System.out.println("AMD CPU的针脚数为:  " + pins);
		
	}
	
	public AmdCpu(int pins) {
		this.pins = pins;
	}

}
