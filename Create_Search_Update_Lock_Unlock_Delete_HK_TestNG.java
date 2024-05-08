package BCNK_TermMajor_AutoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_Search_Update_Lock_Unlock_Delete_HK_TestNG {
	// Khai báo một biến driver kiểu WebDriver với mức độ truy cập là private
	private WebDriver driver;
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 0
	@Test(priority = 0)
	public void Login() throws InterruptedException {
		// Hiển thị thông báo Login
		System.out.println("Login");
		// Mở trang web https://cntttest.vanlanguni.edu.vn:18081/Phancong02/
		driver.get("https://cntttest.vanlanguni.edu.vn:18081/Phancong02/");
		// Tìm và nhấp chuột vào phần tử được xác định bằng XPath để thực hiện hành động
		driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
		// Tìm và nhấp chuột vào phần tử được xác định bằng XPath để thực hiện hành động
		driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/a")).click();
		// Tìm và nhấp chuột vào phần tử được xác định bằng XPath để thực hiện hành động
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/form/div/div/div/button")).click();
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng id "i0116" và nhập chuỗi "hien.2174802010946@vanlanguni.vn" vào phần tử đó
        driver.findElement(By.id("i0116")).sendKeys("hien.2174802010946@vanlanguni.vn");
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[4]/div/div/div/div/input")).click();
        // Dừng thực thi của chương trình trong 2 giây
        Thread.sleep(2000);
        // Tìm phần tử bằng id "i0118" và nhập chuỗi "VLU01122003" vào phần tử đó
        driver.findElement(By.id("i0118")).sendKeys("VLU01122003");
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[5]/div/div/div/div/input")).click();
        // Dừng thực thi của chương trình trong 14 giây
        Thread.sleep(14000);
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[1]/div/label/input")).click();
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
        driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();
	}
	
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 1
	@Test(priority = 1)
	public void Term() throws InterruptedException {
		// Hiển thị thông báo Term
		System.out.println("Term");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/span")).click();
	}
	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 2
	@Test(priority = 2)
	public void Create() throws InterruptedException {
		// Hiển thị thông báo Create Term
		System.out.println("Create Term");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"tblTerm_wrapper\"]/div[1]/div[2]/div/div[2]/button")).click();
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần tử đó
        driver.findElement(By.xpath("//*[@id=\"id\"]")).sendKeys("888");
        // Chọn giá trị từ dropdown menu về năm bắt đầu thúc học kỳ
        WebElement dropdown = driver.findElement(By.id("start_year"));
	    Select select = new Select(dropdown);
	    select.selectByValue("2020");
	    // Chọn giá trị từ dropdown menu về năm kết thúc học kỳ
	    WebElement dropdown2 = driver.findElement(By.id("end_year"));
	    Select select2 = new Select(dropdown2);
	    select2.selectByValue("2025");
	    // Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
        driver.findElement(By.xpath("//*[@id=\"start_week\"]")).clear();
	    // Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
        driver.findElement(By.xpath("//*[@id=\"start_week\"]")).sendKeys("1");
	    // Dừng thực thi của chương trình trong 2 giây
	    Thread.sleep(2000);
	    // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
	    driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[5]/input[2]")).click();
	    // Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[5]")).click();
		// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
        driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).clear();
	    // Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
        driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).sendKeys("5");
        // Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
        driver.findElement(By.xpath("//*[@id=\"max_class\"]")).clear();
	    // Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
        driver.findElement(By.xpath("//*[@id=\"max_class\"]")).sendKeys("3");
        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
     	driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[7]/button[2]")).click();
	}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
		@Test(priority = 3)
		public void Search() throws InterruptedException {
		// Hiển thị thông báo Search
		System.out.println("Search Term");
		// Dừng thực thi của chương trình trong 2 giây
		Thread.sleep(2000);
		// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần tử đó
		driver.findElement(By.xpath("//*[@id=\"tblTerm_filter\"]/label/input")).sendKeys("888");
	}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
		@Test(priority = 4)
		public void Update() throws InterruptedException {
			// Hiển thị thông báo Update Term
			System.out.println("Update Term");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			 // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
			driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr/td[9]/a[1]")).click();
			Thread.sleep(2000);
			// Chọn giá trị từ dropdown menu về năm bắt đầu thúc học kỳ
			WebElement dropdown = driver.findElement(By.id("start_year"));
			Select select = new Select(dropdown);
			select.selectByValue("2021");
			// Chọn giá trị từ dropdown menu về năm kết thúc học kỳ
			WebElement dropdown2 = driver.findElement(By.id("end_year"));
			Select select2 = new Select(dropdown2);
			select2.selectByValue("2026");
			// Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
	        driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).clear();
		    // Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
	        driver.findElement(By.xpath("//*[@id=\"max_lesson\"]")).sendKeys("10");
	        // Tìm phần tử bằng biểu thức XPath và xóa phần tử trong ô đó
	        driver.findElement(By.xpath("//*[@id=\"max_class\"]")).clear();
		    // Tìm phần tử bằng biểu thức XPath và nhập "trong phần sendkeys" vào phần tử đó
	        driver.findElement(By.xpath("//*[@id=\"max_class\"]")).sendKeys("2");
	        // Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
			driver.findElement(By.xpath("//*[@id=\"term-form\"]/div[7]/button[2]")).click();
	}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 5
		@Test(priority = 5)
		public void Lock() throws InterruptedException {
			// Hiển thị thông báo Lock Term
			System.out.println("Lock Term");
			// Dừng thực thi của chương trình trong 3 giây
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr/td[8]/div/input")).click();
	}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 6
		@Test(priority = 6)
		public void Unlock() throws InterruptedException {
			// Hiển thị thông báo Unlock Term
			System.out.println("Unlock Term");
			// Dừng thực thi của chương trình trong 3 giây
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr/td[8]/div/input")).click();
	}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 7
		@Test(priority = 7)
		public void Term1() throws InterruptedException {
			// Hiển thị thông báo Term
			System.out.println("Term1");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
			driver.findElement(By.xpath("//*[@id=\"main-menu-navigation\"]/li[2]/a/span")).click();
		}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
		@Test(priority = 8)
		public void Search1() throws InterruptedException {
			// Hiển thị thông báo Search
			System.out.println("Search Term1");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "trong phần sendkeys" vào phần tử đó
			driver.findElement(By.xpath("//*[@id=\"tblTerm_filter\"]/label/input")).sendKeys("888");
	}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
		@Test(priority = 9)
		public void Delete() throws InterruptedException {
			// Hiển thị thông báo Delete
			System.out.println("Delete");
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
			driver.findElement(By.xpath("//*[@id=\"tblTerm\"]/tbody/tr[1]/td[9]/a[2]")).click();
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
			driver.findElement(By.xpath("/html/body/div[3]/div/div[6]/button[1]")).click();
	}
  	@BeforeClass
  	public void setUp() {
  		// Cài đặt và cấu hình trình điều khiển Chrome tự động bằng WebDriverManager
  		WebDriverManager.chromedriver().setup();
  		// Khởi tạo một thể hiện của ChromeDriver
  		driver = new ChromeDriver();
  		// Phóng to cửa sổ trình duyệt lên kích thước tối đa
  		driver.manage().window().maximize();
  	}

  	@AfterClass
  	public void tearDown() throws InterruptedException {
  			// Dừng thực thi của chương trình trong 5 giây
  			Thread.sleep(5000);
  			// Đóng trình duyệt và kết thúc phiên làm việc
  			driver.quit();
  	}

}
