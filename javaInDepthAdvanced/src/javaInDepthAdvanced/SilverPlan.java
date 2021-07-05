package javaInDepthAdvanced;

public class SilverPlan extends HealthInsurancePlan {
	public double computeMonthlyPremium(double salary) {
		return salary * 0.06;
	}

}
