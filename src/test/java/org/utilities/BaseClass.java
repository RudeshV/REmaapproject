package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Table.Cell;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
	public static Actions a;

	public static void chromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public static void chromeBrowserNew() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	

	public static void launchUrl(String url) {

		driver.get(url);

	}

	public static void maxWindow() {

		driver.manage().window().maximize();
	}

	public static void pageTitle() {

		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

	public static void pageUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void fillTextbox(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void btnClick(WebElement element) {

		element.click();
	}

	// Copy ------CONTROL +C
	public static void copy() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	// paste
	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public void rightClick(WebElement element) {

		a = new Actions(driver);
		a.contextClick(element).perform();
	}

	public static void takeSnap(String picName) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;

		File s = tk.getScreenshotAs(OutputType.FILE);

		File d = new File("C:\\Users\\Welcome\\eclipse-workspace\\FrameworkClass9Am\\Screenshots\\" + picName + ".png");

		FileUtils.copyFile(s, d);

	}

//	public static String readExcel(int rowNo,int cellNo) throws IOException {

//		// 1.File location
//		File f = new File("C:\\Users\\Welcome\\eclipse-workspace\\FrameworkClass9Am\\Excel\\excelwork.xlsx");
//
//		// 2. Read a file
//		FileInputStream fin = new FileInputStream(f);
//
//		// 3.Create workbook
//		Workbook book = new XSSFWorkbook(fin);
//
//		// 4.to fetch a sheet
//		Sheet sh = book.getSheet("Greens");

		//5.fetch a row
//		Row r = sh.getRow(rowNo);
		
//		//6.fetch a cell
//		Cell c = r.getCell(cellNo);
//		
//		int type = c.getCellType();
//		String name="";
//		if (type==1) {
//			
//			name = c.getStringCellValue();
//		}
//		
//		else if (DateUtil.isCellDateFormatted(c)) {
//			Date d = c.getDateCellValue();
//			SimpleDateFormat form=new SimpleDateFormat("dd--MM--yyyy");
//			 name = form.format(d);
//		}
//		
//		else {
//			double d = c.getNumericCellValue();
//			long l=(long)d;
//			 name = String.valueOf(l);
//		}
//		
//		return name;
//
//	}

}

