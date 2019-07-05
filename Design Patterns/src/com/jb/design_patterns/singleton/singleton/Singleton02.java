package com.jb.design_patterns.singleton.singleton;


/**
 * 当 getInstance 方法第一次被调用的时候,它第一次读取SingletonHolder.instance,导致SingletonHolder 类得到初始化;而这个类在装载并被初始化的时候,会
 * 初始化它的静态域，从而创建Singleton02的实例,由于是静态的域,因此只会在虚拟机装载类的时候初始化一次,并由虚拟机保证它的线程安全。
 * 这个模式的优势在于,getInstance方法并没有被同步,并且只是一个执行一个域的访问,因此延迟初始化并没有增加任何成本。
 * @author winer
 *
 */
public class Singleton02 {
	
	private Singleton02() {}
	
	// 类级内部类,也就是静态的成员式内部类,该类的实例与外部类的实例 没有绑定关系,而且只有被调用的时候才会被装载,从而实现了延迟加载.
	
	private static class SingletonHolder{
		// 静态初始化器，由JVM 来保证线程安全
		private static Singleton02 instance = new Singleton02(); 
	}
	
	public static Singleton02 getInstance() {
		return SingletonHolder.instance;
	}
	

}
