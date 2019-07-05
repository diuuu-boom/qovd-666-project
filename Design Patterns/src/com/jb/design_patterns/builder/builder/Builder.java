package com.jb.design_patterns.builder.builder;



import java.util.Date;

import com.jb.design_patterns.builder.message.AutoMessage;

public abstract class Builder {
	
	
	protected AutoMessage msg;
	
	public abstract void buildSubject();   // 标题零件的构造方法
	public abstract void buildBody();      // 内容零件的构造方法
	
	
	// 收件人零件的构造方法
	public void buildTo(String to) {
		msg.setTo(to);
	}
	
	// 发件人零件的构造方法
	public void buildFrom(String from) {
		msg.setFrom(from);
	}
	
	// 发送零件的建造方法
	public void buildSendDate() {
		msg.setSendDate(new Date());
	}
	
	// 邮件产品完成后，用此方法发送邮件
	// 此方法相当于产品返还方法
	public void sendMessage(){
		msg.send();
	}
	
	
	

}
