import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a");
        double a = sc.nextDouble();
        System.out.println("请输入b");
        double b = sc.nextDouble();
        System.out.println("请输入σ");
        double σ = sc.nextDouble();

        Random r = new Random();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet t4 = workbook.createSheet("T3");
        for (int i = 0; i < 50000; i=i+2) {
            double u1 = r.nextDouble();
            double u2 = r.nextDouble();
            double n1=Math.sqrt(-2*Math.log(u1))*Math.cos(2*Math.PI*u2);
            double n2=Math.sqrt(-2*Math.log(u1))*Math.sin(2*Math.PI*u2);
            double x1=a+Math.exp(σ*n1-b);
            double x2=a+Math.exp(σ*n2-b);
            t4.createRow(i).createCell(0).setCellValue(x1);
            t4.createRow(i+1).createCell(0).setCellValue(x2);
        }
        FileOutputStream fos = new FileOutputStream("E:\\学校\\院内学习\\随机水文学\\程序\\src\\main\\resources\\T4.xlsx");
        workbook.write(fos);
        fos.flush();
        fos.close();
        workbook.close();

    }
}
