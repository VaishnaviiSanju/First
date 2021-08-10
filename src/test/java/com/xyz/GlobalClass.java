package com.xyz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GlobalClass {
	public String getData(int rowNo,int cellNo) throws IOException {
		
		String data;
		File file = new File("E:\\Eclipse\\AdactinWeb\\Excel\\Adactin.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(f);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if(cellType==1)
		{
			data = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat date= new SimpleDateFormat("dd/MM/yyyy");
			data = date.format(dateCellValue);
		}else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			data = String.valueOf(l);
		}
		return data;	
	}
	public void send(WebElement element,String data) {
	element.sendKeys(data);
	}
	public void SelectByvisibleText(WebElement element, String Data) {
		new Select(element).selectByVisibleText(Data);

	}
}
