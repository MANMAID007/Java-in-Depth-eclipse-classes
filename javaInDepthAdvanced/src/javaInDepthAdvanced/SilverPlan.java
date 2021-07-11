package javaInDepthAdvanced;

public class SilverPlan extends HealthInsurancePlan {
	public double computeMonthlyPremium(double salary,  int age, boolean smoking) {
		return salary * 0.06 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}
