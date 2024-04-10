package Bai_kiem_tra_giua_ki_2;

import java.util.Date;

public class Intern extends Employee {
	private String Majors;
	private int Semester;
	private String University_name;
	
	public Intern() {
		
	}
	public Intern(int iD, String fullName, String birthDay, int phone, String email, String employee_type,
			String employee_count, String majors, int semester, String university_name) {
		super(iD, fullName, birthDay, phone, email, employee_type, employee_count);
		Majors = majors;
		Semester = semester;
		University_name = university_name;
	}
	public void showInfo() {
		System.out.println("Majors: " + Majors);
		System.out.println("Semester: " + Semester);
		System.out.println("University: " + University_name);
		
	}
}
