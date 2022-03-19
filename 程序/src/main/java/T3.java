import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class T3 {
    public static void main(String[] args) throws IOException {
        Random r = new Random();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet t3 = workbook.createSheet("T2");
        for (int i = 0; i < 50000; i=i+2) {
            double u1 = r.nextDouble();
            double u2 = r.nextDouble();
            double n1=Math.sqrt(-2*Math.log(u1))*Math.cos(2*Math.PI*u2);
            double n2=Math.sqrt(-2*Math.log(u1))*Math.sin(2*Math.PI*u2);
            t3.createRow(i).createCell(0).setCellValue(n1);
            t3.createRow(i+1).createCell(0).setCellValue(n1);
        }
        FileOutputStream fos = new FileOutputStream("E:\\学校\\院内学习\\随机水文学\\程序\\src\\main\\resources\\T3.xlsx");
        workbook.write(fos);
        fos.flush();
        fos.close();
        workbook.close();
    }
}
