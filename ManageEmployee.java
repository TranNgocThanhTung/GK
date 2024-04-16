package GK;

import java.util.ArrayList;
import java.util.Scanner;
public class ManageEmployee {
private ArrayList<Employee> list_e=new ArrayList<>(); 
private ArrayList<Fresher> list_F=new ArrayList<>();
private ArrayList<Experience> list_E=new ArrayList<>();
private ArrayList<Intern> list_I=new ArrayList<>();

public void CreateEmployee() {
	Employee em=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("Employee Type:");
	em.setEmployee_type(sc.nextLine());
	if(em.getEmployee_type().equals("Experience")) {
		Experience ex=new Experience();
		
		System.out.println("ID:");
		ex.setID(sc.nextLine());
		System.out.println("Full Name:");
		ex.setFullName(sc.nextLine());
		System.out.println("Birth Day:");
		ex.setBirthDay(sc.nextLine());
		System.out.println("Phone");
		ex.setPhone(sc.nextLine());
		System.out.println("ExplnYear:");
		ex.setExplnYear(sc.nextInt());
		sc.nextLine();
		System.out.println("ProSkill:");
		ex.setProSkill(sc.nextLine());
		list_E.add(ex);
	}else if(em.getEmployee_type().equals("Fresher")) {
		Fresher fe=new Fresher();
		System.out.println("ID:");
		fe.setID(sc.nextLine());
		System.out.println("Full Name:");
		fe.setFullName(sc.nextLine());
		System.out.println("Birth Day:");
		fe.setBirthDay(sc.nextLine());
		System.out.println("Phone");
		fe.setPhone(sc.nextLine());
		System.out.println("Graduate date:");
		fe.setGraduate_date(sc.nextLine());
		System.out.println("Graduate rank:");
		fe.setGraduate_rank(sc.nextLine());
		System.out.println("Education:");
		fe.setEducation(sc.nextLine());
		list_F.add(fe);	
	}
	else if(em.getEmployee_type().equals("Intern")) {
		Intern In=new Intern();
		System.out.println("ID:");
		In.setID(sc.nextLine());
		System.out.println("Full Name:");
		In.setFullName(sc.nextLine());
		System.out.println("Birth Day:");
		In.setBirthDay(sc.nextLine());
		System.out.println("Phone");
		In.setPhone(sc.nextLine());
		System.out.println("Majors:");
		In.setMajors(sc.nextLine());
		System.out.println("Semester:");
		In.setSemester(sc.nextLine());
		System.out.println("University name:");
		In.setUniversity_name(sc.nextLine());
		list_I.add(In);
	}
   
}
public void ReadEmployee() {
	Scanner s=new Scanner(System.in);
	Employee em=new Employee();
	System.out.println("Employee Type of employee you want to Check:");
	em.setEmployee_type(s.nextLine());
	System.out.println("ID of the employee you want to read:");
	String tim=s.nextLine();
	if(em.getEmployee_type().equals("Experience")) {
		for(Experience ex:list_E) {
			
			if(ex.getID().equals(tim)){
				ex.showInfo();
			}
		}
	}else if(em.getEmployee_type().equals("Fresher")) {
		for(Fresher fe:list_F) {
			if(fe.getID().equals(tim)) {
				fe.showInfo();
			}
		}
	}else if(em.getEmployee_type().equals("Intern")) {
		for(Intern in:list_I) {
			if(in.getID().equals(tim)) {
				in.showInfo();
			}
		}
	}else {
		System.out.println("No employee!!");
	}
	
	
}
public void UpdateEmployee() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Employee Type Update:");
    String employeeType = sc.nextLine();

    System.out.println("ID of the employee you want to update:");
    String id = sc.nextLine();

    if (employeeType.equals("Experience")) {
        for (Experience ex : list_E) {
            if (ex.getID().equals(id)) {
                System.out.println("Choose attribute to update:");
                System.out.println("1. Full Name");
                System.out.println("2. Birth Day");
                System.out.println("3. Phone");
                System.out.println("4. Experience Years");
                System.out.println("5. Professional Skill");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("Update Full Name:");
                        ex.setFullName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Update Birth Day:");
                        ex.setBirthDay(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Update Phone:");
                        ex.setPhone(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("Update Experience Years:");
                        ex.setExplnYear(sc.nextInt());
                        sc.nextLine(); 
                        break;
                    case 5:
                        System.out.println("Update Professional Skill:");
                        ex.setProSkill(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println("Employee information updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    } else if (employeeType.equals("Fresher")) {
        for (Fresher fe : list_F) {
            if (fe.getID().equals(id)) {
                System.out.println("Choose attribute to update:");
                System.out.println("1. Full Name");
                System.out.println("2. Birth Day");
                System.out.println("3. Phone");
                System.out.println("4. Graduate date");
                System.out.println("5. Graduate rank");
                System.out.println("6. Education");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("Update Full Name:");
                        fe.setFullName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Update Birth Day:");
                        fe.setBirthDay(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Update Phone:");
                        fe.setPhone(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("Update Graduate date:");
                        fe.setGraduate_date(sc.nextLine());
                        break;
                    case 5:
                        System.out.println("Update Graduate rank:");
                        fe.setGraduate_rank(sc.nextLine());
                        break;
                    case 6:
                        System.out.println("Update Education:");
                        fe.setEducation(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println("Employee information updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    } else if (employeeType.equals("Intern")) {
        for (Intern in : list_I) {
            if (in.getID().equals(id)) {
                System.out.println("Choose attribute to update:");
                System.out.println("1. Full Name");
                System.out.println("2. Birth Day");
                System.out.println("3. Phone");
                System.out.println("4. Majors");
                System.out.println("5. Semester");
                System.out.println("6. University name");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("Update Full Name:");
                        in.setFullName(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Update Birth Day:");
                        in.setBirthDay(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Update Phone:");
                        in.setPhone(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("Update Majors:");
                        in.setMajors(sc.nextLine());
                        break;
                    case 5:
                        System.out.println("Update Semester:");
                        in.setSemester(sc.nextLine());
                        break;
                    case 6:
                        System.out.println("Update University name:");
                        in.setUniversity_name(sc.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println("Employee information updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    } else {
        System.out.println("Invalid Employee Type.");
    }
}
public void DeleteEmployee() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Employee Type Delete:");
    String employeeType = sc.nextLine();

    System.out.println("ID of the employee you want to delete:");
    String id = sc.nextLine();

    if (employeeType.equals("Experience")) {
        for (Experience ex : list_E) {
            if (ex.getID().equals(id)) {
                list_E.remove(ex);
                System.out.println("Employee with ID " + id + " deleted successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    } else if (employeeType.equals("Fresher")) {
        for (Fresher fe : list_F) {
            if (fe.getID().equals(id)) {
                list_F.remove(fe);
                System.out.println("Employee with ID " + id + " deleted successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    } else if (employeeType.equals("Intern")) {
        for (Intern in : list_I) {
            if (in.getID().equals(id)) {
                list_I.remove(in);
                System.out.println("Employee with ID " + id + " deleted successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    } else {
        System.out.println("Invalid Employee Type.");
    }

}
}
