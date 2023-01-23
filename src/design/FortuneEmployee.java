package design;

import java.util.ArrayList;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws NameNotValidException, DeparmentNotValidException {



		ArrayList<Company> company = new ArrayList<>();
		//Employee e1 = new EmployeeInfo("")
		company.add(new EmployeeInfo("Rakib Uddin", "Marketing", 123, 90000, "Best", "Married", "Day"));
 		company.add(new EmployeeInfo("Arif Uddin", "IT", 456, 150000, "Best", "Married","Night"));
		 company.add(new EmployeeInfo("Sakib Uddin", "Management", 786, 100000, "Good", "Single", "Day"));

		Company.companyEmailAddress = "ABC@gmail.com";
		System.out.println(company);


		/*for(Company c : company) {
			System.out.println(c);
		}*/




	}





}
