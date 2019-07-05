package com.jb.design_patterns.prototype.register;

public class ConcretePrototype2 implements Prototype {

	private String name;
	
	@Override
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype2();
		return prototype;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	

	public String toString(){
		return "Now in Prototype2 , name= " + this.name; 
	}
	

}
