package Week3.day1;

public class Mobile {
public static void main(String[] args) {
	Android intObj=new Samsung();
	String appOne=intObj.openApp();
	String videoOne=intObj.playVideo();
	
	Android intObjOne=new OnePlus();
	String appTwo=intObjOne.openApp();
	String videoTwo=intObjOne.playVideo();
	
	System.out.println("App One : "+appOne+"   Video One: "+videoOne);
	System.out.println("App Two: "+appTwo+"   Video Two: "+videoTwo);
}
}
