package Week3.day1;

public class Automation extends MultipleLanguage implements JavaInterface,TestToolInterface  {
	
	public void java() {
		System.out.println("Selenium Supports Java");
	}
	
	public void selenium() {
		System.out.println("Selenium Support Java, Python and Ruby");
	}

	@Override
	public void ruby() {
		System.out.println("Selenium Supports Ruby");
	}
	
}
