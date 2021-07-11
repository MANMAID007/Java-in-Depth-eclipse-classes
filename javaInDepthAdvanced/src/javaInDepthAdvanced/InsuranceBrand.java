package javaInDepthAdvanced;

public interface InsuranceBrand {
//	private long id;
//	private String name;
//	
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	double computeMonthlyPremium(HealthInsurancePlan healthInsurancePlan,  int age, boolean smoking);

}
