package BCNK_TermMajor_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;
import PagesTermMajor.CheckCreate_HK;
import PagesTermMajor.ThucTe_term;

public class Create_HK_ManyCases_TestNG {
	private WebDriver driver;

	@BeforeTest
	public void Main() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		// Nhận dữ liệu từ phương thức setup
		Setup setup = new Setup();
		driver = setup.setup();
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 0
	@Test(priority = 0)
	public void Login() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		Login login = new Login();
		login.login(driver);
	}

	@Test(priority = 1)
	public void Điền_2_Số() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_HK checkcreate_term = new CheckCreate_HK();
		// Gọi hàm đã được tạo (0 = dòng 1,0 = cột A "trong file excel")
		checkcreate_term.checkcreate_hk(0, 0, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_term thucte1 = new ThucTe_term();
		thucte1.thucte1(driver);
	}

	@Test(priority = 2)
	public void Điền_4_Số() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_HK checkcreate_term = new CheckCreate_HK();
		// Gọi hàm đã được tạo (1 = dòng 2,0 = cột A "trong file excel")
		checkcreate_term.checkcreate_hk(1, 0, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_term thucte2 = new ThucTe_term();
		thucte2.thucte2(driver);
	}

	@Test(priority = 3)
	public void Điền_số_ký_tự_đặc_Biệt() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_HK checkcreate_term = new CheckCreate_HK();
		// Gọi hàm đã được tạo (2 = dòng 3,0 = cột A "trong file excel")
		checkcreate_term.checkcreate_hk(2, 0, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_term thucte3 = new ThucTe_term();
		thucte3.thucte3(driver);
	}

	@Test(priority = 4)
	public void Không_điền() throws IOException, InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		CheckCreate_HK checkcreate_term = new CheckCreate_HK();
		// Gọi hàm đã được tạo (3 = dòng 4,0 = cột A "trong file excel")
		checkcreate_term.checkcreate_hk(3, 0, driver);
		// Nhận tham số đã được chuyền từ pages object modal
		ThucTe_term thucte4 = new ThucTe_term();
		thucte4.thucte4(driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		TearDown teardown = new TearDown();
		teardown.teardown(driver);
	}
}
