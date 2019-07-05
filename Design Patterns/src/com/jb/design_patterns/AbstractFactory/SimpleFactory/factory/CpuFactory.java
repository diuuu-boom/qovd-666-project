package com.jb.design_patterns.AbstractFactory.SimpleFactory.factory;

import com.jb.design_patterns.AbstractFactory.SimpleFactory.cpu.AmdCpu;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.cpu.Cpu;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.cpu.IntelCpu;

/**
 * Cpu 工厂类
 * @author winer
 *
 */

public class CpuFactory {
	
	
	// 制造 cpu 的方法
	public static Cpu createCpu(int type) {
		Cpu cpu = null;
		
		if(type == 1) {
			cpu = new IntelCpu(666);
		}else if(type ==2) {
			cpu = new AmdCpu(888);
		}
		
		return cpu;
	}
	

}
