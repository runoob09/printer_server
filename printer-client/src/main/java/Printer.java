import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        String filePath = "path/to/file.pdf"; // 指定要打印的文件路径

        try {
            // 获取默认的打印服务
            PrintService[] defaultPrintService = PrintServiceLookup.lookupPrintServices(null, null);
            // 创建文件输入流
            for (PrintService printService : defaultPrintService) {

            }

            System.out.println("文件已发送到打印机。");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}