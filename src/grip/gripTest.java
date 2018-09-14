package grip;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class gripTest {
	
	public AppiumDriver<MobileElement> driver;
	
	@Test
	public void launchGrip() throws IOException, Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// Device Configuration
		cap.setCapability("deviceName", "athene_f");
		cap.setCapability("udid", "ZY223SFCNP");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.1.0");
		
		// App Information
		cap.setCapability("appPackage", "com.abnamro.grip.dev");
		cap.setCapability("appActivity", "se.tink.android.MainActivity");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "88");
		
		//Launch driver
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		TimeUnit.SECONDS.sleep(6);
		driver.findElementById("com.abnamro.grip.dev:id/onboardingOkButton").click();
		TimeUnit.SECONDS.sleep(6);
		driver.findElementById("com.abnamro.grip.dev:id/new_user_button").click();
		
	}
	
	
}
