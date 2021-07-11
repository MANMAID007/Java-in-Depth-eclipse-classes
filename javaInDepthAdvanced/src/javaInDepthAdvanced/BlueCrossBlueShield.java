package javaInDepthAdvanced;

public class BlueCrossBlueShield implements InsuranceBrand {
	public double addedValue;
	
	public double computeMonthlyPremium(HealthInsurancePlan healthInsurancePlan, int age, boolean smoking) {
		if(healthInsurancePlan instanceof PlatinumPlan) {
			if(age > 55) addedValue += 200;
			if(smoking == true) addedValue += 100;
		}
		else if(healthInsurancePlan instanceof GoldPlan) {
			if(age > 55) addedValue += 150;
			if(smoking == true) addedValue += 90;
		}
		else if(healthInsurancePlan instanceof SilverPlan) {
			if(age > 55) addedValue += 100;
			if(smoking == true) addedValue += 80;
		}
		else if(healthInsurancePlan instanceof BronzePlan) {
			if(age > 55) addedValue += 50;
			if(smoking == true) addedValue += 70;
		}
		return addedValue;
		
	}

}
