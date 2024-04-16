package GK;

public class Experience extends Employee implements IEmployee {
 private int ExplnYear;
 private String ProSkill;
public Experience(String iD, String fullName, String phone, String birthDay, String email, String employee_type,int ExplnSkill,String ProSkill) {
	super(iD, fullName, phone, birthDay, email, employee_type);
	this.ExplnYear=ExplnYear;
	this.ProSkill=ProSkill;
}
public Experience() {}
 public void showInfo() {
	 super.showInfo();
	 System.out.println("ExplnYear:"+ExplnYear);
	 System.out.println("ProSkill:"+ProSkill);
 }
public int getExplnYear() {
	return ExplnYear;
}
public void setExplnYear(int explnYear) {
	ExplnYear = explnYear;
}
public String getProSkill() {
	return ProSkill;
}
public void setProSkill(String proSkill) {
	ProSkill = proSkill;
}
	

}
