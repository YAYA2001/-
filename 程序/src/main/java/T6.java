import jdk.swing.interop.SwingInterOpUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class T6 {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet t6 = workbook.createSheet("T6");
        FileOutputStream fos = new FileOutputStream("E:\\学校\\院内学习\\随机水文学\\程序\\src\\main\\resources\\T6.xlsx");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入alpha");
        double alpha=sc.nextDouble();
        System.out.println("请输入beta");
        double bata=sc.nextDouble();
        System.out.println("请输入a0");
        double a0=sc.nextDouble();

        int n = (int)Math.floor(alpha);
        double p=alpha-n;

        Random r = new Random();

        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < 50000; i++) {
            double y=0.0;
            for (int i1 = 0; i1 < n; i1++) {
                double u = r.nextDouble();
                y+=Math.log(u)*(-1);
            }

            double x=0;
            double n1 = r.nextDouble();
            double n2 = r.nextDouble();
            double s1 = Math.pow(n1, 1 / p);
            double s2 = Math.pow(n2, 1 / (1 - p));
            if (s1+s2<=1){
                double n3 = r.nextDouble();
                double t=s1/(s1+s2);
                x=(-1)*t*Math.log(n3);
            }else {
                continue;
            }

            double z1=x+y;
            double z=z1/bata+a0;

            list.add(z);
        }

        for (int i = 0; i < list.size(); i++) {
            t6.createRow(i).createCell(0).setCellValue(list.get(i));
        }
        workbook.write(fos);
        fos.flush();
        fos.close();
        workbook.close();

    }
}
