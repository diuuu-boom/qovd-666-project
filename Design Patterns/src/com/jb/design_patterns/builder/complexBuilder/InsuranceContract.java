package com.jb.design_patterns.builder.complexBuilder;
/**
 * 保险合同对象
 * @author winer
 *
 */
public class InsuranceContract {
	
	
	private String contractId;        // 保险合同编号
	
	// 被保险人员的名称，同一份保险合同,要么跟人员签订，要么跟公司签订
	// 也就是说,'被保险人员' 和 '被保险公司' 这个属性,不可能同时有值
	
	private String personName;        // 被保险人员
	private String companyName;       // 被保险公司
	private long beginDate;           // 保险开始生效日期
	private long endDate;             // 保险失效日期
	private String otherDate;         // 其他数据
	
	// 私有化构造方法
	private InsuranceContract(ConcreteBuilder builder) {
		this.contractId = builder.contractId;
		this.personName = builder.personName;
		this.companyName = builder.companyName;
		this.beginDate = builder.beginDate;
		this.endDate = builder.endDate;
		this.otherDate = builder.otherDate;
	}
	
	// 保险合同的一些操作
	public void someOperation(){
        System.out.println("当前正在操作的保险合同编号为【"+this.contractId+"】");
    }
	
	// 具体的 构造者
	public static class ConcreteBuilder {
		private String contractId;        // 保险合同编号
		private String personName;        // 被保险人
		private String companyName;       // 被保险公司
		private long beginDate;           // 保险开始生效日期
		private long endDate;             // 保险失效日期
		private String otherDate;         // 其他数据
		
		// 构造方法，传入必须要有的参数
		public ConcreteBuilder(String contractId, long beginDate, long endDate) {
			this.contractId = contractId;
			this.beginDate = beginDate;
			this.endDate = endDate;
		}
		
		// 被保人姓名
		public ConcreteBuilder personName(String personName) {
			this.personName = personName;
			return this;
		}
		
		// 被保人公司
		public ConcreteBuilder companyName(String compString) {
			this.companyName = compString;
			return this;
		}
		
		// 其他数据
		public ConcreteBuilder otherDate(String otherDate) {
			this.otherDate = otherDate;
			return this;
		}
		
		// 将构建好的对象返回
		// build 方法将决定最终的产品结构
		public InsuranceContract build() {
			if(contractId ==null || contractId.trim().length()==0) {
				throw new IllegalArgumentException("合同编号不能为空");
			}
			boolean signPerson = (personName != null && personName.trim().length()>0);
			boolean signCompany = (companyName != null && companyName.trim().length()>0);
			
			if(signPerson && signCompany) {throw new IllegalArgumentException("一份合同不能同时与个人和公司签订");}
			
			if(signPerson==false && signCompany==false) {throw new IllegalArgumentException("一份合同不能没有签订对象");}
			
			if(beginDate <= 0) {throw new IllegalArgumentException("一份合同必须有开始生效的日期");}
			
			if(endDate < beginDate) {throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");}
			
			return new InsuranceContract(this);
		}

		@Override
		public String toString() {
			return "ConcreteBuilder [contractId=" + contractId + ", personName=" + personName + ", companyName="
					+ companyName + ", beginDate=" + beginDate + ", endDate=" + endDate + ", otherDate=" + otherDate
					+ "]";
		}
	}

	@Override
	public String toString() {
		return "InsuranceContract [contractId=" + contractId + ", personName=" + personName + ", companyName="
				+ companyName + ", beginDate=" + beginDate + ", endDate=" + endDate + ", otherDate=" + otherDate + "]";
	}
	
	
	
	
	

}
