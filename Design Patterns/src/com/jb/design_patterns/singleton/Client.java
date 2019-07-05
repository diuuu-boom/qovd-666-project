package com.jb.design_patterns.singleton;

import com.jb.design_patterns.singleton.eagerSingleton.EagerSingleton;
import com.jb.design_patterns.singleton.enumSingleton.Singleton;
import com.jb.design_patterns.singleton.lazySingleton.LazySingleton;

public class Client {
	
	public static void main(String[] args) {
		EagerSingleton s = EagerSingleton.getInstance();
		
		LazySingleton l = LazySingleton.getInstance();
		
		Singleton.uniqueIntance.singletonOperation();
		
		System.out.println(s);
		System.out.println(l);
		
		
	}
	

}
