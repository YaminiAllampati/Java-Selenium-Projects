import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG_Practice1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

}
