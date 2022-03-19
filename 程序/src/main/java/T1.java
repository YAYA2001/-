import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
public class T1 {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet("data1");
        XSSFRow row = sheet1.createRow(0);
        row.createCell(0).setCellValue("x");
        for (int i = 1; i < 10000; i++) {
            sheet1.createRow(i).createCell(0).setCellValue(r.nextDouble());
        }
        FileOutputStream fos = new FileOutputStream("E:\\学校\\院内学习\\随机水文学\\程序\\src\\main\\resources\\0T1.xlsx");
        workbook.write(fos);
        fos.flush();
        fos.close();
        workbook.close();
    }
}
