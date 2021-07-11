package javaInDepthAdvanced;

public class BronzePlan extends HealthInsurancePlan {
	public double computeMonthlyPremium(double salary,  int age, boolean smoking) {
		return salary * 0.05 + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}

}
