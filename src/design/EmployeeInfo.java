package design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Child Class
public class EmployeeInfo extends Company {

	/**
	 * This class can be implemented from Employee interface then add additional
	 * methods in EmployeeInfo class. Also, Employee interface can be implemented
	 * into an abstract class.So create an Abstract class then inherit that abstract
	 * class into EmployeeInfo class.Once you done with designing EmployeeInfo
	 * class, go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the OOP(abstraction,Encapsulation, Inheritance and
	 * Polymorphism) concepts in every level possible. Use all kind of
	 * keywords(super,this,static,final........) Implement Nested class. Use
	 * Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */

	private String fullName;
	private String department;
	private int id;
	private int salary;

	private String EmployeePerformance;
	private String EmployeeMaritalStatus;
	private int EmployeeExperience;
	private String EmployeeShift;
	private int bonus;
	private int pension;
	private String EmployeeBenefit;

	/*
	 * You must implement the logic for below 2 methods and following 2 methods are
	 * prototype as well for other methods need to be design, as you will come up
	 * with the new ideas.
	 */

	/*
	 * you must have multiple constructor. Must implement below constructor.
	 */
	EmployeeInfo(String fullName) throws NameNotValidException {
		setName(fullName);
	}

	EmployeeInfo(String fullName, String department) throws NameNotValidException, DeparmentNotValidException {
		setName(fullName);
		assignDepartment(department);
	}

	EmployeeInfo(String fullName, String department, int id) throws NameNotValidException, DeparmentNotValidException {
		setName(fullName);
		assignDepartment(department);
		setId(id);
	}

	EmployeeInfo(String fullName, String department, int id, int salary)
			throws NameNotValidException, DeparmentNotValidException {
		setName(fullName);
		setId(id);
		assignDepartment(department);
		setSalary(salary);

	}

	EmployeeInfo(String fullName, String department, int id, int salary, String EmployeePerformance)
			throws NameNotValidException, DeparmentNotValidException {
		setName(fullName);
		setId(id);
		assignDepartment(department);
		setSalary(salary);
		setEmployeePerformance(EmployeePerformance);

	}

	EmployeeInfo(String fullName, String department, int id, int salary, String EmployeePerformance,
				 String EmployeeMaritalStatus) throws NameNotValidException, DeparmentNotValidException {
		setName(fullName);

		setId(id);
		assignDepartment(department);
		setSalary(salary);
		setEmployeePerformance(EmployeePerformance);
		setEmployeeMaritalStatus(EmployeeMaritalStatus);
	}

	EmployeeInfo(String fullName, String department, int id, int salary, String EmployeePerformance,
				 String EmployeeMaritalStatus, String EmployeeShift)
			throws NameNotValidException, DeparmentNotValidException {
		setName(fullName);
		setEmployeeExperience();
		setId(id);
		assignDepartment(department);
		setSalary(salary);
		setEmployeePerformance(EmployeePerformance);
		setEmployeeMaritalStatus(EmployeeMaritalStatus);
		setEmployeeShift(EmployeeShift);

		setEmployeeBonus(EmployeeExperience, salary, EmployeePerformance);
		setEmployeePension(EmployeeExperience, salary);
		benefitLayout();
	}

	// Employee Name
	public void setName(String fullName) throws NameNotValidException {
		// System.out.println(isInteger(fullName));
		if (!isOnlyCharacter(fullName)) {
			throw new NameNotValidException();
		} else {
			this.fullName = fullName;
		}
	}

	public static boolean isOnlyCharacter(String fullName) {
		for (int i = 0; i < fullName.length(); i++) {
			if (Character.isDigit(fullName.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String employeeName() {
		return this.fullName;
	}
	//

	// Employee Department
	@Override
	public void assignDepartment(String department) throws DeparmentNotValidException {
		ArrayList<String> validDepartments = new ArrayList<>(
				Arrays.asList("Marketing", "Finance", "Management", "Human Resourse", "IT"));

		if (validDepartments.contains(department)) {
			this.department = department;
		} else {
			throw new DeparmentNotValidException();
		}

	}
	public String getDepartment() {
		return department;
	}

	//

	// Employee Id
	public void setId(int id) {
		if (id >= 10 && id <= 1000) {
			this.id = id;
		} else {
			System.out.println("Not a valid id");
		}
	}

	@Override
	public int employeeId() {
		return this.id;
	}
	//

	// Salary
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int calculateSalary() {

		return salary;
	}
	//

	// Employee Performance
	public void setEmployeePerformance(String EmployeePerformance) {
		ArrayList<String> performance = new ArrayList<>(Arrays.asList("Best", "Good", "Poor"));
		if (performance.contains(EmployeePerformance)) {
			this.EmployeePerformance = EmployeePerformance;
		} else {
			System.out.println("Invalid input for performance");
		}
	}

	public String getEmployeePerformance() {
		return EmployeePerformance;
	}
	//

	// Employee Marital Status

	public void setEmployeeMaritalStatus(String EmployeeMaritalStatus) {
		ArrayList<String> status = new ArrayList<>(Arrays.asList("Single", "Married", "Divorced", "Widowed"));
		if (status.contains(EmployeeMaritalStatus)) {
			this.EmployeeMaritalStatus = EmployeeMaritalStatus;
		} else {
			System.out.println("Invalid input for status");
		}
	}

	public String getEmployeeMaritalStatus() {
		return EmployeeMaritalStatus;
	}
	//

	public void setEmployeeExperience() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015) for " + this.fullName + ":");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		System.out.println("@@Debug==> ConvertedJoiningDate =  "+ convertedJoiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		String[] JoiningDateSplited = convertedJoiningDate.split("/");
		int totalMonthsUntilJoined = (Integer.parseInt(JoiningDateSplited[1]) * 12)
				+ Integer.parseInt(JoiningDateSplited[0]);

		String[] TodaysDateSplited = convertedTodaysDate.split("/");
		int totalMothsUntilToday = (Integer.parseInt(TodaysDateSplited[1]) * 12)
				+ Integer.parseInt(TodaysDateSplited[0]);

		int totalYear = (totalMothsUntilToday - totalMonthsUntilJoined) / 12;

		if (totalYear >= 1 && totalYear <= 15) {
			this.EmployeeExperience = totalYear;
		} else {
			System.out.println("Experience not valid");
		}

	}

	public int getEmployeeExperience() {

		return EmployeeExperience;
	}

	//

	// Employee Shift
	public void setEmployeeShift(String EmployeeShift) {
		ArrayList<String> shift = new ArrayList<>(Arrays.asList("Day", "Night"));

		if (shift.contains(EmployeeShift)) {
			this.EmployeeShift = EmployeeShift;
		} else {
			System.out.println("Invalid input for shift");
		}
	}

	public String getEmployeeShift() {
		return EmployeeShift;
	}

	//
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Employee Full Name : " + employeeName() + "\n");
		stringBuilder.append("Employee department : " + getDepartment() + "\n");
		stringBuilder.append("Employee ID :" + employeeId() + "\n");
		stringBuilder.append("Employee salary : " + calculateSalary() + "\n");
		stringBuilder.append("\nOther Information about this employee : " + "\n");
		stringBuilder.append("Employee performance : " + getEmployeePerformance() + "\n");
		stringBuilder.append("Employee marital status : " + getEmployeeMaritalStatus() + "\n");
		stringBuilder.append("Employee Experience in Years : " + getEmployeeExperience() + "\n");
		stringBuilder.append("Employee Shift : " + getEmployeeShift() + "\n");
		stringBuilder.append("Employee bonus : " + calculateEmployeeBonus() + "\n");
		stringBuilder.append("Employee Pension : " + calculateEmployeePension() + "\n");
		stringBuilder.append("Applicable benefit : " + getBenefit());
		return super.toString() + stringBuilder.toString() + "\n";
	}

	/**
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the
	 * logic. Hints: 10% of the salary for best performance, 8% of the salary for
	 * average performance and so on. You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public void setEmployeeBonus(int EmployeeExperience, int salary, String EmployeePerformance) {
		if (EmployeeExperience > 5 && salary >= 100000 && EmployeePerformance.equals("Best")) {
			this.bonus = salary * 20 / 100;
		} else if (EmployeeExperience > 5 && salary >= 100000 && EmployeePerformance.equals("Good")) {
			this.bonus = salary * 15 / 100;
		} else if (EmployeeExperience > 5 && salary >= 100000 && EmployeePerformance.equals("Poor")) {
			this.bonus = salary * 10 / 100;
		} else if (EmployeeExperience > 5 && salary <= 100000 && EmployeePerformance.equals("Best")) {
			this.bonus = salary * 20 / 100;
		} else if (EmployeeExperience > 5 && salary <= 100000 && EmployeePerformance.equals("Good")) {
			this.bonus = salary * 15 / 100;
		} else if (EmployeeExperience > 5 && salary <= 100000 && EmployeePerformance.equals("Poor")) {
			this.bonus = salary * 10 / 100;
		} else if (EmployeeExperience <= 5 && salary >= 100000 && EmployeePerformance.equals("Best")) {
			this.bonus = salary * 10 / 100;
		} else if (EmployeeExperience <= 5 && salary >= 100000 && EmployeePerformance.equals("Good")) {
			this.bonus = salary * 5 / 100;
		} else if (EmployeeExperience <= 5 && salary >= 100000 && EmployeePerformance.equals("Poor")) {
			this.bonus = salary * 2 / 100;
		} else if (EmployeeExperience <= 5 && salary <= 100000 && EmployeePerformance.equals("Best")) {
			this.bonus = salary * 10 / 100;
		} else if (EmployeeExperience <= 5 && salary <= 100000 && EmployeePerformance.equals("Good")) {
			this.bonus = salary * 5 / 100;
		} else if (EmployeeExperience <= 5 && salary <= 100000 && EmployeePerformance.equals("Poor")) {
			this.bonus = salary * 1 / 100;
		}

	}

	@Override
	public int calculateEmployeeBonus() {
		return this.bonus;
	}
	//

	/**
	 * This methods should calculate Employee Pension based on salary and numbers of
	 * years with the company. Then it will return the total pension. So you need to
	 * implement the logic. Hints: pension will be 5% of the salary for 1 year, 10%
	 * for 2 years with the company and so on.
	 *
	 */
	public void setEmployeePension(int EmployeeExperience, int salary) {

		// implement numbers of year from above two dates
		// Calculate pension

		int percent = 5 * EmployeeExperience;
		this.pension = (salary * percent) / 100;

	}

	public int calculateEmployeePension() {
		return this.pension;
	}


	@Override
	public void benefitLayout() {
		ArrayList<String> benefit = new ArrayList<>(Arrays.asList("401k","Paid Vacation","Stock Rewards"));
		if(this.EmployeeExperience <= 5 && this.EmployeeExperience > 0) {
			this.EmployeeBenefit = benefit.get(0);
		}
		else if(this.EmployeeExperience >= 6 && this.EmployeeExperience <= 10) {
			this.EmployeeBenefit = benefit.get(0) + ", " + benefit.get(1);
		}
		else if(this.EmployeeExperience >= 11 && this.EmployeeExperience <= 15) {
			this.EmployeeBenefit = benefit.get(0) + ", " + benefit.get(1) + ", " + benefit.get(2);
		}
		else {
			System.out.println("Benefit not valid");
		}
	}

	public String getBenefit() {
		return this.EmployeeBenefit;
	}


	private static class DateConversion {

		public DateConversion(Months months) {

		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
