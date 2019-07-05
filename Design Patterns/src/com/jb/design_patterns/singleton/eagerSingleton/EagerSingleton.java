package com.jb.design_patterns.singleton.eagerSingleton;
/**
 * 饿汉式 单利模式
 */
public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	// 私有默认构造函数
	private EagerSingleton() {}
	
	// 静态工厂方法
	public static EagerSingleton getInstance() {
		return instance;
	}

	
	public void test(){
		System.out.println("我是懒汉式单例模式....");
	}
	
}
