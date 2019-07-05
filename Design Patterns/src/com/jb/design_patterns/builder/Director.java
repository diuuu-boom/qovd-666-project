package com.jb.design_patterns.builder;

import com.jb.design_patterns.builder.builder.Builder;

public class Director {

	private Builder builder;
	
	// 构造函数
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	
	// 产品的构造方法,负责调用各零件的构建方法
	public void construct(String toAddress,String fromAddress) {

		this.builder.buildTo(toAddress);
		this.builder.buildFrom(fromAddress);
		this.builder.buildSendDate();
		this.builder.buildSubject();
		this.builder.buildBody();
		this.builder.buildSendDate();
		this.builder.sendMessage();
		
	}
	
}
