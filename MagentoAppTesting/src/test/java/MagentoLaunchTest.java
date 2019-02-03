import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoLaunchTest {

	@Test
	public void test() {

		String url = "http://magento.com";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);

		Home h = new Home(driver);

		h.clickOnMyacc();

		Login l = new Login(driver);
		l.enterEmail("nitinmanjunath1991@gmail.com");
		l.enterPassword("Welcome123");
		l.clickOnlogin();

		Logout lo = new Logout(driver);
		lo.clickOnLogout();

		driver.quit();

	}

}
