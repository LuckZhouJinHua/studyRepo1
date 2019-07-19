import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class POITestByLianhua {

    public static void main(String[] args) throws IOException {
        FileInputStream ins = new FileInputStream("C:\\Users\\12539\\Desktop\\导入模版.xls");

        //创建一个工作簿 2003 xls HSSFWorkbook
        Workbook wb = new HSSFWorkbook(ins);
        //读取文件
        Sheet sheetAt = wb.getSheetAt(0);
        //获取总共行数
        int rows = sheetAt.getPhysicalNumberOfRows();
        Cell cell = sheetAt.getRow(3).getCell(1);

        String stringCellValue = cell.getStringCellValue();
        double value = cell.getNumericCellValue();
        CellType cellType = cell.getCellType();
        System.out.println(cellType+"yyy");
        System.out.println("value = " + value);
        System.out.println(value==0);



    }

}
