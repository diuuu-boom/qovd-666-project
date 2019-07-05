package com.jb.design_patterns.AbstractFactory.cpu;

public class IntelCpu implements Cpu {
	
	private int pins = 0;

	@Override
	public void getPins() {
		System.out.println("Intel CPU 的针脚数为:   " + pins);
	}
	
	public IntelCpu(int pins) {
		this.pins = pins;
	}

}
