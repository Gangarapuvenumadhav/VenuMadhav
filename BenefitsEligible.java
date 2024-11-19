//Creating an  interface BenefitsEligible
public interface BenefitsEligible 
{
    //Declaring the Abstract method called applyBenefits()
	public void applyBenefits();
    /*Creating  a static method displayEligibilityRules() that
    prints the eligibility rules for an employee to get the benefits*/
	public static void displayEligibilityRules()
	{
		System.out.println("ELIGIBILITY RULES FOR EMPLOYEE'S BENEFITS");
		System.out.println("1.FOR HEALTH INSURANCE:");
		System.out.println("\t->Full-time employees are eligible for health insurance after a 30-day probation period.");
		System.out.println("2.FOR PAID LEAVES:");
		System.out.println("\t->Employees accrue 1 day of paid leave per month of service.\r\n"
				+ "\t->Maximum accrued leave cannot exceed 30 days.");
		System.out.println("3.FOR BONUS:");
		System.out.println("\t->Performance-based bonuses are awarded based on annual performance reviews.");
	}
}
