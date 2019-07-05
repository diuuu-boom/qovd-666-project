package com.jb.design_patterns.AbstractFactory.SimpleFactory.cpu;

/**
 * CPU 实现类
 *  AMD CPU
 * @author winer
 *
 */
public class AmdCpu implements Cpu {

	private int pins = 0; //针脚数
	
	// 计算 针脚数的方法
	@Override
	public void calculate() {
		System.out.println("AMD 的针脚数：" + pins);
	}
	
	
	public AmdCpu(int pins) {this.pins = pins;}

}
