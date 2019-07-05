package com.jb.design_patterns.prototype.simple;

public class ConcretePrototype2 implements Prototype {
	
	@Override
	public Object clone() {
		
		// 最简单的克隆,新建一个自身对象，由于没有属性就不再复制了
		Prototype prototype = new ConcretePrototype2();
		
		return prototype;
		
	}

}
