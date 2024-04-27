package com.neotech.testbase;

import com.neotech.pages.AddDisciplinaryCaseElements;
import com.neotech.pages.AddEmployeeElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.DisciplinaryCasesElements;
import com.neotech.pages.EmployeeListElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.PersonalDetailsElements;
import com.neotech.seleniumsteps.FileUploadWithPageObjModel;



public class PageInitializer extends BaseClass {
	
	public static LoginPageElements login; 
	public static DashboardPageElements dashboard;
	public static AddEmployeeElements addEmployee;
	public static PersonalDetailsElements personalDetails;
	public static EmployeeListElements employeeList;  
	public static DisciplinaryCasesElements disciplinaryCase;
	public static AddDisciplinaryCaseElements  addDisciplinaryCase;
//	public static FileUploadWithPageObjModel fileUpload;
	
	
	
	
	public static void initialize() {
		
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmployee = new AddEmployeeElements();
		personalDetails = new PersonalDetailsElements();
		employeeList = new EmployeeListElements();
		disciplinaryCase = new DisciplinaryCasesElements();
		addDisciplinaryCase = new AddDisciplinaryCaseElements();
//		fileUpload = new FileUploadWithPageObjModel();
	}
}
