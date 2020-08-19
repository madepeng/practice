package practice.java.csv;

import org.apache.commons.csv.CSVFormat;

import java.io.*;

/**
 * @ClassName TestChangeColumns
 * @Description: TODO
 * @Author madepeng
 * @Date 2019/12/16
 * @Version V1.0
 **/
public class TestChangeColumns {
    //CSV文件分隔符
    private final static String NEW_LINE_SEPARATOR="\n";
    private final static char Delimiter= '|';

    public static void main(String[] args) throws FileNotFoundException {
        String replyFilePath = "D://test1.txt";
        String receiveFilePath = "D://test.txt";
        //创建CSVFormat
        CSVFormat formator = CSVFormat.DEFAULT.withDelimiter('|').withRecordSeparator('\n');

        String line = "";
        try(FileReader fileReader=new FileReader(receiveFilePath);
            BufferedReader br = new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    replyFilePath));) {

            int i = 0;
            while ((line = br.readLine()) != null){
                final String s;
                if (i == 0) {
                    s = line + Delimiter + "testColum";
                } else {
                    s = line + Delimiter + "1";
                }
                writer.write(s);
                writer.newLine();
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
