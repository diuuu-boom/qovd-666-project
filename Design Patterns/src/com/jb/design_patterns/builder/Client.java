package com.jb.design_patterns.builder;

import com.jb.design_patterns.builder.builder.Builder;
import com.jb.design_patterns.builder.builder.GoodByeBuilder;
import com.jb.design_patterns.builder.builder.WelcomeBuilder;
import com.jb.design_patterns.builder.complexBuilder.InsuranceContract;

public class Client {
	
	public static void main(String[] args) {
		
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
		
		System.out.println(builder);
		// 设置所需要的数据，然后键保险合同对象
		InsuranceContract contract = builder.personName("小明").otherDate("小明是个傻逼").build();
		
		System.out.println(contract);
		
		contract.someOperation();
		
	}

}
