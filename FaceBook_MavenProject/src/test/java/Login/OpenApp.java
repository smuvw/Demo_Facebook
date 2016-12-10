package Login;

import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenApp {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		Logger log=Logger.getLogger("devpinoyLogger");
		
		driver.get("https://www.facebook.com/");
		
		log.debug(" Facebook Application is opened");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		log.debug("Title is displayed");

	}

}
