import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {  // capablities is a method which can be used for every test 
		// add selenium jars and appium client jar
		// first we need to talk to appium then appium will inturn invoke our virtual or real device so first write code to connect with appium server
		// pass client to appium server
		/*desired cap for emulator
		 * open your specific emulator  and invoke specific app on emulator 
		 * install an app (initially might not be in emulator)
	  */
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");// instead of hard we use file class and pass the path 
		DesiredCapabilities cap = new DesiredCapabilities(); // DesiredCapabilities is a class developed by selenium and appium guys, which takes information in json and gives to appium server
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"MounikaEmulator1"); // I need a device or emulator with name MounikaEmulator
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath()); // keep the apk file in our project source it is good practice and instead of hard we use file class and pass the path
		// connection to appium server 
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);  // androidDriver is class for android to invoke appium server in which we will be sending two arg 1) server link 2)capabilities obj to get info about emulator and app 
	return driver;
	}

}
