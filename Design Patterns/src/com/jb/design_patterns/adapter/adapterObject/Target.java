package com.jb.design_patterns.adapter.adapterObject;


/**
 * 目标角色、（需要调用的接口）
 * @author winer
 *
 */
public interface Target {
	
	// 这是源类 Adaptee 也有的方法
	public void sampleOperation1();
	
	// 这是源类 Adaptee 没有的方法
	public void sampleOperation2();

}
