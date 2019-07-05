package com.jb.design_patterns.singleton.lazySingleton;

// synchronized 涉及 线程安全使用该关键字
public class LazySingleton {
	
	private static LazySingleton instance = null;
	
	// 默认构造函数
	private LazySingleton() {	}
	
	// 静态工厂方法
	public static synchronized LazySingleton getInstance() {
		
		if(instance == null) {instance = new LazySingleton();}
		
		return instance;
		
	}
	
	

}
