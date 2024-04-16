package GK;

public class Employee implements IEmployee {
private String ID;
private String FullName;
private String Phone;
private String BirthDay;
private String Email;
private String Employee_type;
private  int  Employee_count=0;


	public Employee(String iD, String fullName, String phone, String birthDay, String email, String employee_type
		) {
	
	ID = iD;
	FullName = fullName;
	Phone = phone;
	BirthDay = birthDay;
	Email = email;
	Employee_type = employee_type;
	Employee_count++;
}
public Employee() {}

	@Override
	public void showInfo() {
		System.out.println("ID:"+ID);
		System.out.println("Full Name:"+FullName);
		System.out.println("Phone:"+Phone);
		System.out.println("Birth Day:"+BirthDay);
		System.out.println("Email:"+Email);
		System.out.println("Employee Type:"+Employee_type);
		
	}
	public int getEmployee_count() {
		return Employee_count;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getFullName() {
		return FullName;
	}


	public void setFullName(String fullName) {
		FullName = fullName;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public String getBirthDay() {
		return BirthDay;
	}


	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getEmployee_type() {
		return Employee_type;
	}


	public void setEmployee_type(String employee_type) {
		Employee_type = employee_type;
	}


	public void setEmployee_count(int employee_count) {
		Employee_count = employee_count;
	}

}
