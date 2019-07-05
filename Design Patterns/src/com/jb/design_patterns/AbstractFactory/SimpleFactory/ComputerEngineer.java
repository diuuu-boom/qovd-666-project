package com.jb.design_patterns.AbstractFactory.SimpleFactory;

import com.jb.design_patterns.AbstractFactory.SimpleFactory.cpu.Cpu;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.factory.CpuFactory;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.factory.MainboardFactory;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.mainboard.Mainboard;

public class ComputerEngineer {
	
	// 组装工程师需要拿到 cpu 和 主板 进行组装
	private Cpu cpu = null;           
	private Mainboard mainborad = null;
	
	
	// 组装电脑
	public void makeComputer(int cpuType,int mainboardType) {
		// 准备好装机需要的配件
		prepareHardwares(cpuType,mainboardType);

	}
	
	public void prepareHardwares(int cpuType,int mainboardType) {
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainborad = MainboardFactory.createMainboard(mainboardType);
		
		this.cpu.calculate();
		this.mainborad.installCPU();
	}

}
