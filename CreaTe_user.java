package PagesUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreaTe_user {
	public void create(WebDriver driver) throws InterruptedException {
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/button")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "2174802010637" vào phần tử đó
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[1]/input")).sendKeys("2174802010637");
        // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[2]/input")).sendKeys("Phạm Quốc Thái");
        // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "thai.2174802010637@vanlanguni.vn" vào phần tử đó
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/input")).sendKeys("thai.2174802010637@vanlanguni.vn");
        // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span/span[1]/span/span[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[4]/div/span[2]/span/span[2]/ul/li[1]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span/span[1]/span")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[5]/div/span[2]/span/span[2]/ul/li[3]")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[7]/button[2]")).click();
		// Dừng thực thi của chương trình trong 1 giây
				Thread.sleep(1000);
				try {
					// Tìm phần tử theo xpath
					WebElement element = driver
							.findElement(By.xpath("//div[@id='toast-container']/div[@class='toast toast-success']"));

					// Lấy giá trị của thuộc tính class
					String classAttributeValue = element.getAttribute("class");

					// Kiểm tra xem classAttributeValue có chứa chuỗi "toast toast-success" hay
					// không
					if (classAttributeValue.contains("toast toast-success")) {
						System.out.println("Lưu thành công.");
					}
				} catch (Exception e) {
					driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
					// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
					// tử đó
					driver.findElement(By.xpath("//button[@id='btnClose']")).click();
					System.out.println("Học kỳ này đã được tạo trong hệ thống.");
				}
	}
}
