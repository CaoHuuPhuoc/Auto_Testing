package BCNK_TermMajor_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;
import PagesTermMajor.CreaTe_N;
import PagesTermMajor.DeLete_N;
import PagesTermMajor.SeaRch_N;
import PagesTermMajor.TeRm;
import PagesTermMajor.UpDate_N;

public class Create_Search_Update_Delete_N_TestNG {
	// Khai báo một biến driver kiểu WebDriver với mức độ truy cập là private
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

		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 1
		@Test(priority = 1)
		public void Term() throws InterruptedException {
			// Nhận tham số đã được chuyền từ pages object modal
			TeRm term = new TeRm();
			term.term(driver);
		}

		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 2
		@Test(priority = 2)
		public void Create() throws InterruptedException {
			// Nhận tham số đã được chuyền từ pages object modal
			CreaTe_N create = new CreaTe_N();
			create.create(driver);
		}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
		@Test(priority = 3)
		public void Search() throws InterruptedException {
			// Nhận tham số đã được chuyền từ pages object modal
			SeaRch_N search = new SeaRch_N();
			search.search(driver);
		}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
		@Test(priority = 4)
		public void Update() throws InterruptedException {
			// Nhận tham số đã được chuyền từ pages object modal
			UpDate_N update = new UpDate_N();
			update.update(driver);
		}
		// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
		@Test(priority = 5)
		public void Delete() throws InterruptedException {
			// Nhận tham số đã được chuyền từ pages object modal
			DeLete_N delete = new DeLete_N();
			delete.delete(driver);
		}
		@AfterClass
		public void tearDown() throws InterruptedException {
			// Nhận tham số đã được chuyền từ pages object modal
			TearDown teardown = new TearDown();
			teardown.teardown(driver);
		}
}
