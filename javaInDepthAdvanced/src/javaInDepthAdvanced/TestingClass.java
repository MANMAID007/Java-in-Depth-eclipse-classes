package javaInDepthAdvanced;

public class TestingClass {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.setPatientId(1);
        p1.setFirstName("Anish");
        double totalBillAmount =1000;
        PlatinumPlan insurance2 = new PlatinumPlan();
        p1.setInsurancePlan(insurance2);
        // first test case without any insurance
        //double[] payments = Billing.computePaymentAmount(p1,totalBillAmount);
        /*System.out.println("Patient with no insurance");
        System.out.println("Insurance will pay: "+payments[0]+"\n"+"Patient will pay: "+payments[1]);

        // create gold Insurance

        GoldPlan insurance1 = new GoldPlan();
        // set this insurance to the patient
        p1.setInsurancePlan(insurance1);

        // calling the compute bill GoldPlan insurance
        payments = Billing.computePaymentAmount(p1,totalBillAmount);
        System.out.println("Patient with Gold insurance plan ");
        System.out.println("Insurance will pay: "+payments[0]+"\n"+"Patient will pay: "+payments[1]);

        // create a platinum insurance
        //PlatinumPlan insurance2 = new PlatinumPlan();
        // set platinum insurance to the patient
        //p1.setInsurancePlan(insurance2);
        // calling the compute bill GoldPlan insurance*/
        
        double[] payments = Billing.computePaymentAmount(p1,totalBillAmount);
        System.out.println("Patient with Platinum insurance plan");
        System.out.println("Insurance will pay: "+payments[0]+"\n"+"Patient will pay: "+payments[1]);




    }
}
