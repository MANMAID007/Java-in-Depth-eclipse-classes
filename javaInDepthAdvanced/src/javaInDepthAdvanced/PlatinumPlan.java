package javaInDepthAdvanced;

public class PlatinumPlan extends HealthInsurancePlan{
	public double computeMonthlyPremium(double salary) {
		return salary * 0.08;
	}
	
}
