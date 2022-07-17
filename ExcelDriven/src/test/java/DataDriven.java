import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven {
	//Identify Test cases column by scanning the entire 1st row
	//once column is identified then scan entire test case column to identify purchase test case row
	//after you grab purchase test case row = pull all the data of that row and feed into test

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D://DemoData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//To find number of sheets
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet= workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();	//sheet is collection of rows
				Row firstrow= rows.next();	//to select first row in sheet
				Iterator<Cell> ce = firstrow.cellIterator();	//row is collection of cells
				int k=0;
				int column = 0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						column=k;
					}
					k++;
				}
				System.out.println(column);
			//once coloumn is identified then scan entire test case coloum to identify purchase test case row
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
				
					{
				//after you grab purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{
							System.out.print(cv.next().getStringCellValue());
			
						}
					}
				}
			}
			
		}
	}

}
