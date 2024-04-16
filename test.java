package GK;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	ManageEmployee ma=new ManageEmployee();
	Boolean check=true;
	Scanner sc=new Scanner(System.in);
	while(check==true) {
		System.out.println("1.Tạo nhân viên \n2.Đọc info Nhân viên\n3.Cập nhật nhân viên\n4.Xóa nhân viên");
		int a=sc.nextInt();
		switch(a) {
		case 1:ma.CreateEmployee();break;
		case 2:ma.ReadEmployee();break;
		case 3:ma.UpdateEmployee();break;
		case 4:ma.DeleteEmployee();break;
		}
	}
}

}
