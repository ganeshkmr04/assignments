package Week3.day1;

public class MainClassStudent {
	public static void main(String[] args) {
		
		Students stud=new Students();
		stud.getStudentInfo();
		stud.getStudentInfo(12345);
		stud.getStudentInfo("Ganesh");
		stud.getStudentInfo("ganeshkumar65@gmail.com","8050180086");
	}
}
