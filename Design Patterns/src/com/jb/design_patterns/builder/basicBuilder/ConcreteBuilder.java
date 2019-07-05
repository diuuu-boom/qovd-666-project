package com.jb.design_patterns.builder.basicBuilder;

class ConcreteBuilder implements Builder {
	
	// 私有化 产品类
	private Product product = new Product();

	
	@Override
	public void builderPart1() {
		// 构建产品的第一个零件
		product.setPart1("编号: 9527");

	}

	@Override
	public void builderPart2() {
		product.setPart2("姓名: 您🐎");

	}

	
	// 将构建好的产品返回
	@Override
	public Product retrieveResult() {
		
		return product;
	}

}
