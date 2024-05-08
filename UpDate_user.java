package PagesUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpDate_user {
	public void update(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/table/tbody/tr/td[7]/a[1]/i")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span/span[1]/span/span[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[2]/span/span[2]/ul/li[2]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span/span[1]/span/span[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span[2]/span/span[2]/ul/li[2]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[7]/button[2]")).click();	
		// Dừng thực thi của chương trình trong 1 giây
				Thread.sleep(1000);
				// Lấy xpath thông báo thành công
				WebElement element = driver
						.findElement(By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']"));

				// Lấy giá trị của thuộc tính class
				String classAttributeValue = element.getAttribute("class");

				// Kiểm tra xem classAttributeValue có chứa chuỗi "toast toast-success" hay
				// không
				if (classAttributeValue.contains("toast toast-success")) {
					System.out.println("cập nhật thành công.");
				} else {
					System.out.println("cập nhật không thành công.");
				}
	}
}
