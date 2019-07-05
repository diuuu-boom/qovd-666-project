package com.jb.design_patterns.builder.builder;

import com.jb.design_patterns.builder.message.WelcomeMessage;

public class WelcomeBuilder extends Builder {
	
	public WelcomeBuilder() { // 建造者初始化,创建欢迎邮件信息。
		msg = new WelcomeMessage();
	}

	@Override
	public void buildSubject() {
		System.out.println("欢迎标题...");
		msg.setSubject("欢迎标题");
	}

	@Override
	public void buildBody() {
		System.out.println("欢迎内容...");
		msg.setBody("欢迎内容");
	}

}
