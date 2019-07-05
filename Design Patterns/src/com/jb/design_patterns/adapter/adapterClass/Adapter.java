package com.jb.design_patterns.adapter.adapterClass;

public class Adapter extends Adaptee implements Target {

	/**
	 * 由于源类 Adaptee 没有方法sampleOperation2()
	 * 因此适配器补充上这个方法
	 */
	
	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		// 相关的代码
	}
	
	@Override
	public void sampleOperation1() {
		// TODO Auto-generated method stub
		super.sampleOperation1();
	}

}
