package com.jb.design_patterns.AbstractFactory;

import com.jb.design_patterns.AbstractFactory.cpu.Cpu;
import com.jb.design_patterns.AbstractFactory.factory.AbstractFactory;
import com.jb.design_patterns.AbstractFactory.mainboard.Mainboard;

public class ComputerEngineer {
	
	
	private Cpu cpu = null; // 需要组装的 cpu
	private Mainboard mainboard = null; // 需要组装的 mainboard
	
	// 组装电脑
	public void makeComputer(AbstractFactory factory){
		prepareHardwares(factory);
	}
	
	private void prepareHardwares(AbstractFactory factory) {
		this.cpu = factory.createCpu();
		this.mainboard = factory.createMainboard();
		
		// 测试配件
		this.cpu.getPins();
		this.mainboard.getHoles();
	}
	

}
