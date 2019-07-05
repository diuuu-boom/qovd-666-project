package com.jb.design_patterns.builder.builder;

import com.jb.design_patterns.builder.message.GoodByeMessage;

public class GoodByeBuilder extends Builder {

	public GoodByeBuilder() {
		msg = new GoodByeMessage();
	}
	
	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		msg.setSubject("欢送标题...");
	}

	
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		msg.setBody("欢送内容...");
	}

}
