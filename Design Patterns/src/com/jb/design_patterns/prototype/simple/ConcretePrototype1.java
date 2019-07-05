package com.jb.design_patterns.prototype.simple;

public class ConcretePrototype1 implements Prototype {

	@Override
	public Object clone(){
		
		// 最简单的克隆,新创建一个自身对象,由于没有属性就不再复制值了
		Prototype prototype = new ConcretePrototype1();
		
		return prototype;
		
	}
	
}
