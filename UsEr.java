package PagesUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsEr {
	public void user(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
	}
}
