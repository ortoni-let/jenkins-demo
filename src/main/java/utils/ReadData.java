package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	

	private XSSFWorkbook workbook ;
	public String[][]  getData(String filename){
		try {
			workbook = new XSSFWorkbook("./testdata/"+filename+".xlsx");
		} catch (IOException e) {
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Rows: "+lastRowNum);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell: "+lastCellNum);
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
				System.out.println(value);
				data[i-1][j] = value;
			} 
		}
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
