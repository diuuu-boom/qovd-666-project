package com.jb.design_patterns.adapter.adapterClass;

/**
 * 目标角色（所需要的接口）
 * @author winer
 *
 */
public interface Target {
	
	/**
	 * 这是源类 Adaptee 也有方法
	 */
	public void sampleOperation1();
	
	/**
	 * 这是源类 Adapteee 没有的方法
	 */
	public void sampleOperation2();

}
