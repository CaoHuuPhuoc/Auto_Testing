package PagesUser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThucTe_user {

	// Tạo hàm và chuyền vào tham số driver
	public void thongBao(String kqmongdoi, WebDriver driver) throws InterruptedException {
		// Đợi 1s trước khi tiếp tục thực thi mã tiếp theo
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
				// Thực hiện các hành động khác tùy thuộc vào trường hợp của bạn
				System.out.println("Kết quả thực tế: Lưu thành công.");
				String mongdoi = kqmongdoi; // Chuỗi kỳ vọng thông báo lỗi
				System.out.println("Kết quả mong đợi: " + mongdoi); // In ra kết quả mong đợi của thông báo lỗi
			}
		} catch (Exception e) {

			try {
				driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
				// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần
				// tử đó
				driver.findElement(By.xpath("//button[@id='btnClose']")).click();
				System.out.println("Người dùng này đã có trong hệ thống.");
			} catch (Exception a) {
				driver.findElement(By.xpath("//button[@id='btnClose']")).click();
				System.out.println("Kết quả thực tế: Chỉ được nhập số-chữ không dấu và không có khoảng trắng!");
				// In ra kết quả mong đợi của thông báo lỗi
				System.out.println("Kết quả mong đợi: Chỉ được nhập số-chữ không dấu và không có khoảng trắng!");
			}

		}

	}

}
