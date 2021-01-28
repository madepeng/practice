package iotest;

import java.io.*;

/**
 * @ClassName InputStreamTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/18
 * @Version V1.0
 **/
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(new File("D:\\test\\test.txt"));
        String res = "";
        while (inputStream.read() != -1) {
            res += (char) inputStream.read();
        }
        System.out.println(res);

        res = "";
        InputStream inputStream1 = new FileInputStream(new File("D:\\test\\test2.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream1, "UTF-8");
        /*while (inputStreamReader.read() != -1) {
            res += (char) inputStreamReader.read();
        }
        System.out.println(res);*/

        res = "";
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (bufferedReader.readLine() != null) {
            res += bufferedReader.readLine();
        }
        System.out.println(res);

        /*InputStream inputStream3 = new FileInputStream(new File("D:\\test\\test3.txt"));
        DataInputStream dataInputStream = new DataInputStream(inputStream3);
        System.out.println(dataInputStream.readInt());*/

        PrintWriter pw = new PrintWriter("D:\\test\\test4.txt");
        pw.println("fdsfdsfdsfdf");
        pw.println("gggggggggggg");
        pw.flush();
        pw.close();

        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\test\\test4.txt")));
        String line;
        while ((line = bufferedReader1.readLine()) != null) {
            System.out.println("out:" + line);
        }
    }
}
