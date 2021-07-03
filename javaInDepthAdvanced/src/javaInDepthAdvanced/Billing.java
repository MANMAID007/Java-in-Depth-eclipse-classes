package javaInDepthAdvanced;

public class Billing {
	public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();
        if(patientInsurancePlan == null) {
        	payments[0] = 0;
        	payments[1] = amount - 20;
        } else if(patientInsurancePlan instanceof PlatinumPlan) {
        	patientInsurancePlan.setCoverage(0.9);
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 50;
        } else if(patientInsurancePlan instanceof GoldPlan) {
        	patientInsurancePlan.setCoverage(0.8);
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 40;
        } else if(patientInsurancePlan instanceof SilverPlan) {
        	patientInsurancePlan.setCoverage(0.7);
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 30;
        } else if(patientInsurancePlan instanceof BronzePlan) {
        	patientInsurancePlan.setCoverage(0.6);
        	payments[0] = amount * patientInsurancePlan.getCoverage();
        	payments[1] = amount - payments[0] - 25;
        }

        return payments;
    }

}
