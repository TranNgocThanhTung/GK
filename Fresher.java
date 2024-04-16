package GK;

public class Fresher extends Employee implements IEmployee {
private String Graduate_date;
private String Graduate_rank;
private String Education;
public Fresher(String iD, String fullName, String phone, String birthDay, String email, String employee_type,String Graduate_date,String Graduate_rank,String Education) {
	super(iD, fullName, phone, birthDay, email, employee_type);
	this.Graduate_date=Graduate_date;
	this.Graduate_rank=Graduate_rank;
	this.Education=Education;
}
public Fresher() {}
public String getGraduate_date() {
	return Graduate_date;
}
public void setGraduate_date(String graduate_date) {
	Graduate_date = graduate_date;
}
public String getGraduate_rank() {
	return Graduate_rank;
}
public void setGraduate_rank(String graduate_rank) {
	Graduate_rank = graduate_rank;
}
public String getEducation() {
	return Education;
}
public void setEducation(String education) {
	Education = education;
}
public void showInfo() {
	super.showInfo();
	System.out.println("Graduate Date:"+Graduate_date);
	System.out.println("Graduate Rank:"+Graduate_rank);
	System.out.println("Education:"+Education);
}

}
