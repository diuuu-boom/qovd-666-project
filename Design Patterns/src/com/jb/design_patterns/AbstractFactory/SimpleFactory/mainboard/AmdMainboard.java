package com.jb.design_patterns.AbstractFactory.SimpleFactory.mainboard;

/**
   *   主板实现类
 * AMD 主板
 * @author winer
 *
 */
public class AmdMainboard implements Mainboard {

	private int cpuHoles = 0;
	
	@Override
	public void installCPU() {
		System.out.println("AMD 主板 的插孔数为：" + cpuHoles);

	}
	
	public AmdMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

}
