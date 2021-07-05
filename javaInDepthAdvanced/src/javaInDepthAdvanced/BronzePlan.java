package javaInDepthAdvanced;

public class BronzePlan extends HealthInsurancePlan {
	public double computeMonthlyPremium(double salary) {
		return salary * 0.05;
	}

}
