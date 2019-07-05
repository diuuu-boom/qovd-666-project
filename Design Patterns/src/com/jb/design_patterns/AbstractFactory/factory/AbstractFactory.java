package com.jb.design_patterns.AbstractFactory.factory;

import com.jb.design_patterns.AbstractFactory.cpu.Cpu;
import com.jb.design_patterns.AbstractFactory.mainboard.Mainboard;

public interface AbstractFactory {
	
	// 制作CPU
	public Cpu createCpu();
	
	
	// 制作主板
	public Mainboard createMainboard();
	
}
