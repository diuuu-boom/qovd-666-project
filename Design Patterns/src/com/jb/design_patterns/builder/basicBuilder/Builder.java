package com.jb.design_patterns.builder.basicBuilder;

/**
 * 
 * 抽象建造者
 * @author winer
 *
 */
public interface Builder {

	public void builderPart1();    // 建造产品 零件构造的方法1
	public void builderPart2();    // 建造产品 零件构造的方法2
	
	public Product retrieveResult();
	
	
}
