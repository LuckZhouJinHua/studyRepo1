import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javax.lang.model.element.VariableElement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class POITest {
    public static void main(String[] args) throws Exception {
//创建文件输入流对象
        FileInputStream ins = new FileInputStream("C:\\Users\\12539\\Desktop\\test.xls");
        //解析Excel工作簿
        HSSFWorkbook wb = new HSSFWorkbook(ins);
        //解析工作表
        int sheets_size = wb.getNumberOfSheets();
        System.out.println("几个工作表 = " + sheets_size);
        //遍历工作表中的数据
        for (int i = 0; i < sheets_size; i++) {
            //通过工作簿对象得到每一个工作表
            HSSFSheet sheet = wb.getSheetAt(i);
            System.out.println("当前工作表名称 = " + sheet);
            //得到有效行数
            int rows = sheet.getPhysicalNumberOfRows();
            System.out.println("有效行数:" + rows);
            for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
                System.out.println("正在读取第几行" + rowIndex);
                //第一行表头不读取
                if (rowIndex != 0) {
                    //得到一行数据
                    HSSFRow row = sheet.getRow(rowIndex);
                    for (int cellIndex = 0; cellIndex < 3; cellIndex++) {
                        HSSFCell rowCell = row.getCell(cellIndex);
                        System.out.println(rowCell.getStringCellValue());
                    }
                }
            }
        }
    }
}
