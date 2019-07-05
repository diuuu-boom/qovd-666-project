package com.jb.design_patterns.AbstractFactory.SimpleFactory.factory;

import com.jb.design_patterns.AbstractFactory.SimpleFactory.mainboard.AmdMainboard;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.mainboard.IntelMainboard;
import com.jb.design_patterns.AbstractFactory.SimpleFactory.mainboard.Mainboard;

/**
 * Mainboard 主板类
 * @author winer
 *
 */
public class MainboardFactory {

	// 制作 主板 方法
	public static Mainboard createMainboard(int type) {
		
		Mainboard mainboard = null;
		
		if(type==1) {
			mainboard = new IntelMainboard(666) ;
		}else if(type==2) {
			mainboard = new AmdMainboard(888) ;
		}
		
		return mainboard;
	}
	
}
