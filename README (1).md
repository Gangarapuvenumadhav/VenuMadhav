# Java_and_Data_Structures_Week_4_Assignment
First we Creating an  interface BenefitsEligible.
Now Declaring the Abstract method called applyBenefits()
Creating  a static method displayEligibilityRules() that prints the eligibility rules for an employee to get the benefits.
After that Creating a Employee class which extends abstract class Person and implements Payable interface and BenefitsEligible interface
And Declaring the variables and now Creating a parameterized is constructor Employee which access the values and calling the super class constructor Person and passing the values to it
Now Overriding a calculatePay() method which calculates the salary of an employee by deducting and adding the bonus.
Handling the exceptions by using try and catch block.It's throws an exceptions if the basesalary of an employee is equals to zero by using the throw keyword.
Then the catch block catches the exceptions and provides the user friendly error message.
now overriding the applyBenefits() method that prints the benefits of an employee that are given by the company and implementing  displayPersonInfo() method which prints complete details of the employee,implementing the setSalary() method that sets the salary of an employee,Handling the exceptions are using the try and catch block.
Then it generates user defined Exception i.e salaryException().
 if the salary is less than 5000 by using the throw keyword 
The catch block catches the exceptions and provides the user friendly error message.
The finally block should print a message indicating that the salary setup attempt has been completed,
 regardless of whether an exception was thrown.Then Creating an object for the Employee class and passing the values is completed.
Now crewting a new EmployeeTracker class.
calling  the static method displayEligibilityRules() and  calling the printPaySlip() and setSalary() method then employeetracker was completed.
Again now Creating an interface Payable.
And Creating an abstract method calculatePay() and Creating the default method printPlaySlip() that prints the message then payable was ended.
Now Creating a abstract class Person.
then we declaring the variables as protected and creating a paramaterized constructor for Person class after declaring the abstract method displayPersonInfo() then it was completed.
At final we Creating a SalaryException class which extends the pre-defined Exception class.
Then we get required the Final Output as given as.