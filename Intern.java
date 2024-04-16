package GK;

public class Intern extends Employee implements IEmployee {
	private String Majors;
	private String Semester;
	private String University_name;
	public Intern(String iD, String fullName, String phone, String birthDay, String email, String employee_type,String Majors,String Semester,String University_name) {
		super(iD, fullName, phone, birthDay, email, employee_type);
		this.Majors=Majors;
		this.Semester=Semester;
		this.University_name=University_name;
	}
	public Intern() {}
	public String getMajors() {
		return Majors;
	}
	public void setMajors(String majors) {
		Majors = majors;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public String getUniversity_name() {
		return University_name;
	}
	public void setUniversity_name(String university_name) {
		University_name = university_name;
	}
	

}
