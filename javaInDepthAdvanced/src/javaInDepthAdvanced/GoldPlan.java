package javaInDepthAdvanced;

public class GoldPlan extends HealthInsurancePlan {
	public double computeMonthlyPremium(double salary) {
		return salary * 0.07;
	}

}
