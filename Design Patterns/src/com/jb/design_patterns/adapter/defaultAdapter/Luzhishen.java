package com.jb.design_patterns.adapter.defaultAdapter;

/**
 * 鲁智深 想要实现接口 和尚,就必须实现里面的所有方法。但是鲁智深是个酒肉和尚，是无法做到这一切的。
 * 这时我们需要写一个类 帮助鲁智深去实现这个接口，而我们只需要让鲁智深继承这个类就可以做到了。
 * @author winer
 *
 */
public class Luzhishen extends Tianxin  {

	@Override
	public void xiwu() {
		// TODO Auto-generated method stub
		super.xiwu();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	
}
