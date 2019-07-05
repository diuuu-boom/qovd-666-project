package com.jb.design_patterns.prototype.register;


public class Client {
	
	public static void main(String[] args) {
		Prototype prototype1 = new ConcretePrototype1();
		PrototypeManager.setPrototype("prototype1", prototype1);
		
		try {
			Prototype prototype = PrototypeManager.getPrototype("prototype1");
			prototype.setName("您妈");
//			System.out.println("这是第一个原型：" + prototype);
			//---------------------------------------------
			Prototype prototype2 = new ConcretePrototype2();
			PrototypeManager.setPrototype("prototype1", prototype2);
			Prototype prototypr3 = PrototypeManager.getPrototype("prototype1");
			System.out.println("这是第二个原型：" + prototypr3);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("这就其他妈个比怪了");
		}
		
		
	}
	
	

}
