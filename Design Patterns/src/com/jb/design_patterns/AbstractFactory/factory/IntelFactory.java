package com.jb.design_patterns.AbstractFactory.factory;

import com.jb.design_patterns.AbstractFactory.cpu.Cpu;
import com.jb.design_patterns.AbstractFactory.cpu.IntelCpu;
import com.jb.design_patterns.AbstractFactory.mainboard.IntelMainboard;
import com.jb.design_patterns.AbstractFactory.mainboard.Mainboard;

public class IntelFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(666);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new IntelMainboard(666);
	}

}
