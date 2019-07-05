package com.jb.design_patterns.AbstractFactory.SimpleFactory.mainboard;

/**
   *   主板实现类
 * Intel 主板
 * @author winer
 *
 */
public class IntelMainboard implements Mainboard {
	
	private int cpuHoles = 0;  // CPU 插孔数
	

	@Override
	public void installCPU() {
		System.out.println("因特尔 主板的 插孔数：" + cpuHoles);
	}
	
	
	public IntelMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

}
