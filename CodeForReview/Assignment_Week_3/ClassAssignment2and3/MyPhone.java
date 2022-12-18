package Week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		
		IPhone iphoneObj=new IPhone();
		String start=iphoneObj.startApp();
		System.out.println(start);
		int incVol=iphoneObj.increaseVolume();
		System.out.println("Increasing Volume To "+incVol);
		String stop=iphoneObj.shutDown();
		System.out.println(stop);
		iphoneObj.makeCall();
		iphoneObj.sendSMS();
		//iphoneObj.watchMovie();
		
		
	}

}
