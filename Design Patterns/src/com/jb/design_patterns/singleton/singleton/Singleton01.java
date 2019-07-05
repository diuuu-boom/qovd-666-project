package com.jb.design_patterns.singleton.singleton;

public class Singleton01 {
	private volatile static Singleton01 instance = null;
	
	private Singleton01() {}
	
	public static Singleton01 getInstance() {
		// 先检查实例化是否存在,如果不存在才进入下面的同步块
		if(instance == null) {
			// 同步块,线程安全的创建实例
			synchronized (Singleton01.class) {
				//再次检查实例是否存在,如果不存在才正真的创建实例
				if(instance == null) {
					
					instance = new Singleton01();
					
				}
			}
		}
		return instance;
	}
	
}
