package com.jb.design_patterns.AbstractFactory.SimpleFactory.cpu;

/**
 * CPU 接口实现类
 * 
   *   因特尔 CPU
 * 
 * @author winer
 *
 */

public class IntelCpu implements Cpu {
	
	private int pins = 0;   //针脚数
	
	// 计算针脚数的方法
	@Override
	public void calculate() {
		System.out.println("因特尔 CPU 的针脚数：" + pins);
	}
	
	
	public IntelCpu(int pins) {this.pins = pins;}

	
}
