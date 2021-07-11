package javaInDepthAdvanced;

public class PlatinumPlan extends HealthInsurancePlan{
	public double computeMonthlyPremium(double salary,  int age, boolean smoking) {
		return salary * 0.08 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
	
}
