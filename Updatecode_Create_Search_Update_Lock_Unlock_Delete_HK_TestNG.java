package BCNK_TermMajor_AutoTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PagesChung.Login;
import PagesChung.Setup;
import PagesChung.TearDown;
import PagesTermMajor.CreaTe_HK;
import PagesTermMajor.DeLete_HK;
import PagesTermMajor.LoCk_HK;
import PagesTermMajor.SeaRch_HK;
import PagesTermMajor.TeRm;
import PagesTermMajor.UnLock_HK;
import PagesTermMajor.UpDate_HK;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;

public class Updatecode_Create_Search_Update_Lock_Unlock_Delete_HK_TestNG {
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
		CreaTe_HK create = new CreaTe_HK();
		create.create(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 3
	@Test(priority = 3)
	public void Search() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		SeaRch_HK search = new SeaRch_HK();
		search.search(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 4
	@Test(priority = 4)
	public void Update() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UpDate_HK update = new UpDate_HK();
		update.update(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 5
	@Test(priority = 5)
	public void Lock() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		LoCk_HK lock = new LoCk_HK();
		lock.lock(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 6
	@Test(priority = 6)
	public void Unlock() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		UnLock_HK unlock = new UnLock_HK();
		unlock.unlock(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 7
	@Test(priority = 7)
	public void Term1() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		TeRm term = new TeRm();
		term.term(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
	@Test(priority = 8)
	public void Search1() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		SeaRch_HK search = new SeaRch_HK();
		search.search(driver);
	}

	// Định nghĩa một phương thức kiểm thử mới có độ ưu tiên là 8
	@Test(priority = 9)
	public void Delete() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		DeLete_HK delete = new DeLete_HK();
		delete.delete(driver);
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		// Nhận tham số đã được chuyền từ pages object modal
		TearDown teardown = new TearDown();
		teardown.teardown(driver);
	}

}
