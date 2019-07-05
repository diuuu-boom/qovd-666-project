package com.jb.design_patterns.prototype.register;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
	
	// 创建容器储存 原型 --->储存再内存中
	private static Map<String,Prototype > map = new HashMap<String,Prototype>();
	
	// 私有化构造函数,禁止外部类实例化
	private PrototypeManager() {}
	
	// 创建存放原型方法
	public synchronized static void setPrototype(String key,Prototype value) {
		map.put(key, value);
	}
	
	// 创建删除原型方法
	public synchronized static void removePrototype(String key ) {
		map.remove(key);
	}
	
	// 创建获得原型方法
	public synchronized static Prototype getPrototype(String key)throws Exception {
		
		Prototype prototype = map.get(key);
		
		if(prototype == null) {
			throw new Exception("所需要的原型未注册,或已注销。");
		}
		
		return prototype;
	}
	
	
	

}
