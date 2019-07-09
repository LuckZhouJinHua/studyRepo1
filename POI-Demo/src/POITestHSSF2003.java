import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class POITestHSSF2003 {
    public static void main(String[] args) throws IOException {
        //创建一个工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //写出文件
        FileOutputStream fs = new FileOutputStream("POI-Demo/wb2003.xls");
        //创建sheet页
        HSSFSheet sheet1 = workbook.createSheet("第一个sheet页");
        HSSFSheet sheet2 = workbook.createSheet("第二个sheet页");
        //创建row行
        HSSFRow row1 = sheet1.createRow(0);

        HSSFRow row2 = sheet1.createRow(1);
        //创建列cell
        HSSFCell cell1 = row1.createCell(0);
        HSSFCell cell2 = row1.createCell(1);
        HSSFCell cell3 = row1.createCell(2);
        HSSFCell cell4 = row1.createCell(3);
        HSSFCell cell5 = row1.createCell(4);

        HSSFCell row2Cell1 = row2.createCell(0);
        HSSFCell row2Cell2 = row2.createCell(1);
        HSSFCell row2Cell3 = row2.createCell(2);
        HSSFCell row2Cell4 = row2.createCell(3);
        HSSFCell row2Cell5 = row2.createCell(4);
        HSSFCell row2Cell6 = row2.createCell(5);
        //像单元格写入3
        cell1.setCellValue("姓名");
        cell2.setCellValue("工号");
        cell3.setCellValue("部门");
        cell4.setCellValue("联系电话");
        cell5.setCellValue("邮箱");


        row2Cell1.setCellValue("zhangsan");
        row2Cell2.setCellValue("2019");
        row2Cell3.setCellValue("RD");
        row2Cell4.setCellValue("12222222");
        row2Cell5.setCellValue("@163.COM");
        workbook.write(fs);
        fs.close();




    }
}
