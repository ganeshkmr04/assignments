package Week3.day1;

public class MyPad extends IPad {
	public static void main(String[] args) {
		IPad ipad=new IPad();
		ipad.watchMovie();
		ipad.watchMovie("Landscape");
		ipad.watchMovie("Landscape", 30);
	}
}
