import java.io.*;
import java.util.Collection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileToZip {
    public static void main(String[] args) throws IOException {
        //建立要压缩的文件file的对象
        File fileToZip = new File("D:\\rfr\\Java\\ch22.txt");
        FileInputStream src = new FileInputStream(fileToZip);
        //建立压缩的位置对象
        FileOutputStream ziptosave = new FileOutputStream("D:\\rfr\\Java\\ch22.zip");
        ZipOutputStream dst = new ZipOutputStream(ziptosave);
        //在压缩文件内建立压缩项目
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        dst.putNextEntry(zipEntry);
        //byte方式读出未压缩文件src对象，然后以zip格式写入输出串流dst对象
        byte[] bytes = new byte[1024];
        int length;
        while ((length=src.read(bytes))>=0){
            dst.write(bytes,0,length);
        }
        dst.close();
        src.close();

    }

}
