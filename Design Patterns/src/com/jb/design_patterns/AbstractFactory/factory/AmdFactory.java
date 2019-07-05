package com.jb.design_patterns.AbstractFactory.factory;

import com.jb.design_patterns.AbstractFactory.cpu.AmdCpu;
import com.jb.design_patterns.AbstractFactory.cpu.Cpu;
import com.jb.design_patterns.AbstractFactory.mainboard.AmdMainboard;
import com.jb.design_patterns.AbstractFactory.mainboard.Mainboard;

public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(888);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new AmdMainboard(888);
	}

}
