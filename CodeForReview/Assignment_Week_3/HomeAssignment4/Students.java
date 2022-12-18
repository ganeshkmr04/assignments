package Week3.day1;

public class Students {
	public void getStudentInfo() {
		System.out.println("Information about Students");
	}
	public void getStudentInfo(int id) {
		System.out.println("Student Id: " + id);
	}
	public void getStudentInfo(String name) {
		System.out.println("Student Name: "+name);
	}
	public void getStudentInfo(String email,String phone) {
		System.out.println("Student Mail: "+email+"Mobile: "+phone);
	}
}
