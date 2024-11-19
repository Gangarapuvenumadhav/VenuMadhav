//Creating and Employee class which extends abstract class Person and implements Payable interface and BenefitsEligible interface
public class Employee extends Person implements Payable,BenefitsEligible  {
	double bonus;
	double deductions;//Declaring the variables
	double basesalary;
	double TotalPay=0.0;
	boolean healthInsurance;
	int paidLeaveDays;
    //Creating a parameterized is constructor Employee which access the values
	Employee(double basesalary,double bonus,double deductions,boolean healthInsurance, int paidLeaveDays)
	{
        // calling the super class constructor Person and passing the values to it
		super("Madhav",20);
		this.basesalary=basesalary;
		this.bonus=bonus;
		this.deductions=deductions;
		this.healthInsurance=healthInsurance;
		this.paidLeaveDays=paidLeaveDays;
	}
    //Overriding a calculatePay() method which calculates the salary of an employee by deducting and adding the bonus
	public double calculatePay() 
	{
        //Handling the exceptions by using try and catch block
		try
		{
            //It's throws an exceptions if the basesalary of an employee is equals to zero by using the throw keyword
		if(basesalary==0.0)
		{
			throw new Exception();
		}
		}
        //the catch block catches the exceptions and provides the user friendly error message
		catch(Exception e)
		{
			System.out.println("!!!Salary cannot be ZERO.");
		}
		TotalPay=basesalary+bonus-deductions;
		return TotalPay;
	}
    //overriding the applyBenefits() method that prints the benefits of an employee that are given by the company
	public void applyBenefits()
	{
		System.out.println("Employee Benefits:");
		if(healthInsurance==true)
		{
		System.out.println("Employee is provided with healthInsurance");
		}
		System.out.println("Employee is having paidLeaveDays of : "+paidLeaveDays);
		System.out.println("Employee is provided with a Bonus of : "+bonus);
	}
    // implementing  displayPersonInfo() method which prints complete details of the employee
	void displayPersonInfo() 
	{
		System.out.println("Employee details are :");
		System.out.println("Employee Namee is: "+name);
		System.out.println("Employee Age is: "+age);
	}
    //implementing the setSalary() method that sets the salary of an employee
	public void setSalary(double salary)
	{
        //Handling the exceptions are using the try and catch block
		try
		{
            /*It generates user defined Exception i.e salaryException()
             if the salary is less than 5000 by using the throw keyword */
			if(salary<5000.0)
			{
				throw new SalaryException ();
			}
			else
			{
				this.basesalary=salary;
			}
		}
         //the catch block catches the exceptions and provides the user friendly error message
		catch(SalaryException  e)
		{
			System.out.println("!!!Invalid salary is provided.\nSalary must me greater than 5000");
		}
        /*The finally block should print a message indicating that the salary setup attempt has been completed,
         regardless of whether an exception was thrown.*/
		finally
		{
            System.out.println("FINALLY BLOCK:");
			System.out.println("The salary setup attempt has been completed..");
		}
	}
	public static void main(String args[])
	{
        //Creating an object for the Employee class and passing the values
		Employee e=new Employee(77000.0,10000.0,5000.0,true,1);
		e.displayPersonInfo();//Calling the displayPersonInfo() method for printing the details of an employee
		System.out.println("CalculatePay() method Output:");
		double res=e.calculatePay();
		System.out.println("Employee salary after all Calculations is "+res);
		e.applyBenefits();
	}
}