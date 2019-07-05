package com.jb.design_patterns.builder.basicBuilder;

/**
 * 客户端类  Client
 * @author winer
 *
 */
public class Client {
	
	
	public static void main(String[] args) {
		
		Builder builder = new ConcreteBuilder();     // 建造者
		Director director = new Director(builder);   // 导演者
		
		director.construct();                        // 导演让 建造者再内部 构建组件
		Product product = builder.retrieveResult();  // 返回建造者 建造的产品
		
		System.out.println(product.getPart1());      // 取出组建
		System.out.println(product.getPart2());      
	}

}
