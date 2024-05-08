package PagesUser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckCreate_user {
	// Tạo hàm và chuyền vào tham số dong cot driver
		public void checkcreate_user(int dong, int cot, int cot1, int cot2, WebDriver driver) throws IOException, InterruptedException {
			// Mở file Excel và lấy dữ liệu từ sheet đầu tiên
			FileInputStream fis = new FileInputStream("E:\\Auto tester\\BCNK_Automation_Testing\\BCN_Khoa_Test\\resoures\\drivers\\user.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Lấy dữ liệu dòng và cột trong file Excel
			XSSFRow row = sheet.getRow(dong);
			String MGV = row.getCell(cot).getStringCellValue();
			String TGV = row.getCell(cot1).getStringCellValue();
			String EM = row.getCell(cot2).getStringCellValue();
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và thực hiện hành động nhấp chuột vào phần tử đó
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/section/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/button")).click();
			// Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "2174802010637" vào phần tử đó
	        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[1]/input")).sendKeys(MGV);
	        // Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "Phạm Quốc Thái" vào phần tử đó
	        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[2]/input")).sendKeys(TGV);
	        // Dừng thực thi của chương trình trong 2 giây
			Thread.sleep(2000);
			// Tìm phần tử bằng biểu thức XPath và nhập chuỗi "thai.2174802010637@vanlanguni.vn" vào phần tử đó
	        driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/div[3]/input")).sendKeys(EM);
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
			// Dừng thực thi của chương trình trong 3 giây
			Thread.sleep(3000);
	}
}
