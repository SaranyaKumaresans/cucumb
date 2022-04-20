package cucumber.Adactin_Project_9AM;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cucumber_Base1 {

	public static WebDriver driver;

//	public static WebDriver Browser() {
//
//		System.setProperty("webdriver.chrome.driver", "D:\\TRB\\AdactinHotelApp\\driver\\chromedriver.exe");
//		System.getProperty("user.dir");
//		driver = new ChromeDriver();
//		return driver;
//
//	}

public static void Browser(String browser) {
browser.equals("chrome");

		System.setProperty("webdriver.chrome.driver", "D:\\TRB\\Adactin_Project_9AM\\Driver1\\chromedriver.exe");
		System.getProperty("user.dir");
		driver=new ChromeDriver();
	
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	
	public static void CurrentUrl() {
		driver.getCurrentUrl();
	}

	public static void manage() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void navigateTo(String linkTo) {
		try {
			driver.navigate().to(linkTo);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void navigateFor() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void navigateRefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getThisUrl(String displayLink) {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current Url  :" + currentUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getTitle(String displayTitle) {
		try {
			String title = driver.getTitle();
			System.out.println("Title :" + title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getPageSrc(String displayValues) {
		try {
			String pageSource = driver.getPageSource();
			System.out.println("Source :-" + pageSource);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getWinHandle(String window) {
		try {
			String windowHandle = driver.getWindowHandle();
			System.out.println("Window  :" + windowHandle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getWinHandles(String windows) {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void alertAccept() {

		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void alertDismiss() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void alertGetText() {
		try {
			String alertText = driver.switchTo().alert().getText();
			System.out.println("Display text   :" + alertText);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void actionClass(WebElement element) {
		try {
			Actions builder = new Actions(driver);
			builder.click().perform();
			builder.contextClick().perform();
			builder.moveToElement(element).perform();
			builder.contextClick(element).perform();
			builder.dragAndDrop(element, element).perform();
			builder.sendKeys(element, "value").perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void frameClass(WebElement element) {
		try {
			driver.switchTo().frame(0);
			driver.switchTo().frame("");
			driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void selectInd(WebElement element, int i) {
		try {
			Select sc = new Select(element);
			sc.selectByIndex(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectValue(WebElement element, String value) {
		try {
			Select sc1 = new Select(element);
			sc1.selectByValue(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void selectVisi(WebElement element, String value) {
		try {
			Select sc2 = new Select(element);
			sc2.selectByVisibleText(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void checkBox(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void isEnable(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			System.out.println("Is it enabled ? " + enabled);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void isDisplayed(WebElement element) {
		try {
			boolean displayed = element.isDisplayed();
			System.out.println("Is it Displayed ?" + displayed);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void isSelected(WebElement element) {
		try {
			boolean selected = element.isSelected();
			System.out.println("Is the element selected? " + selected);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getAttribute(WebElement element) {
		try {
			String attribute = element.getAttribute(null);
			System.out.println("Attribute Value :" + attribute);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void getLocation(WebElement element) {
		try {
			Point location = element.getLocation();
			location.x = 0;
			location.y = 0;
			int x = location.getX();
			System.out.println(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void screenShot(WebElement element) {

//		try {
//			TakesScreenshot screenShot = (TakesScreenshot) driver;
//			File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
//			File desFile = new File("/Users/srilakshmi/eclipse-workspace/Selinium_Script/screenshot//mm.png");
//			FileUtils.copyFile(srcFile, desFile);
//		} catch (WebDriverException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	public static void scrollUpDown(WebElement element) {
		try {
			JavascriptExecutor execute = (JavascriptExecutor) driver;
			execute.executeScript("arguments[0].scrollIntoView()", element);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void enterContent(WebElement element, String content) {
		try {
			element.sendKeys(content);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void inputElements(WebElement element, String value) {
		try {
			element.sendKeys(value);
//				element.findElement(By.className(value));
//				element.findElement(By.id(value));
//				element.findElement(By.xpath(value));
//				element.findElement(By.linkText(value));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void keyComm(WebElement element, Keys keys) {
		try {
			keyComm(element, Keys.ENTER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
