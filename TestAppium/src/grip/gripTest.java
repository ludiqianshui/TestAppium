package grip;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class gripTest {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	public void launchGrip() throws IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// Device Configuration
		cap.setCapability("deviceName", "angler");
		cap.setCapability("udid", "ENU7N15B03014038");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		
		// App Information
		cap.setCapability("appPackage", "com.abnamro.grip.dev");
		cap.setCapability("appActivity", "se.tink.android.MainActivity");
		
		//Launch driver
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
				
		
		
		
	}
	
	
}
