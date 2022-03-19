import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class T5 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("E:\\学校\\院内学习\\随机水文学\\程序\\src\\main\\resources\\T4.xlsx");
        XSSFWorkbook workbook1 = new XSSFWorkbook();
        XSSFSheet sheett5 = workbook1.createSheet("T5");
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            double v = sheet.getRow(i).getCell(0).getNumericCellValue();
            double v1 = Math.log(v);
            sheett5.createRow(i).createCell(0).setCellValue(v1);
        }
        FileOutputStream fos = new FileOutputStream("E:\\学校\\院内学习\\随机水文学\\程序\\src\\main\\resources\\T5.xlsx");
        workbook1.write(fos);
        fos.flush();
        fos.close();
        workbook1.close();
    }
}
