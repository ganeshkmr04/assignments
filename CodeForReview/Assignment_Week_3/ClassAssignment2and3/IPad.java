package Week3.day1;

public class IPad extends IOS {
	public void watchMovie() {
		System.out.println("Now Watching Movie");
	}
	public void watchMovie(String orientation) {
		System.out.println("Now Watching Movie in Video Orientation: "+orientation);
	}
	public void watchMovie(String orientation, int timeout) {
		System.out.println("Now Watching Movie in Video Orientation: "+orientation+" with timeout of "+timeout + " minutes.");
	}
}
