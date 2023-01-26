package week7.marathon.tc;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static String[][] readData(String SheetName) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/salesForce.xlsx");
		XSSFSheet ws=wb.getSheet(SheetName);
		XSSFCell cell;
		int rowcount=ws.getLastRowNum();
		int cellCount=ws.getRow(0).getLastCellNum();
		String cellValue;
		Double cellValueNum;
		
		String[][] inputData=new String[rowcount][cellCount];
		
		for (int i = 1; i <= rowcount; i++) {
			for(int j=0; j<cellCount; j++) {
				cell=ws.getRow(i).getCell(j);
				if(cell.getCellType()==CellType.NUMERIC) {
					cellValueNum=cell.getNumericCellValue();
					cellValue=cellValueNum.toString();
				}
				else {
					cellValue=ws.getRow(i).getCell(j).getStringCellValue();
				}
				
				inputData[i-1][j]=cellValue;
			}
		}
		wb.close();
		return inputData;
	}
}