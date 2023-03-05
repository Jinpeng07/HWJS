import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.Collection;
import java.lang.Math;

public class JavaFunction {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String filePath = "C:\\Users\\Jinpeng\\Desktop\\java" + File.separator +"test.txt";
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)))){
//            bw.write("第三行");
//            bw.write("第三行");
            bw.append("append");
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))){
            String line = bf.readLine();//读取第一行
            while (line != null){
                System.out.println(line);
                line = bf.readLine();//读取下一行
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
