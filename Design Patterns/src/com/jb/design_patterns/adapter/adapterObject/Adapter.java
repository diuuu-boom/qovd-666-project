package com.jb.design_patterns.adapter.adapterObject;

public class Adapter {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	// 源类 Adaptee 有方法 sampleOperation1  因此适配器类直接委派即可
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}
	
	// 源类 Adaptee 没有方法 sampleOperation2, 因此由适配器类需要补充此方法
	public void sampleOperation2() {
		// 写相关代码
	}

}




