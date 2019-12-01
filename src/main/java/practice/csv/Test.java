package practice.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Description TODO
 * @Author madepeng
 * @Date 2019/10/8 14:24
 * @Version 1.0
 */
public class Test {
    //CSV文件分隔符
    private final static String NEW_LINE_SEPARATOR="\n";

    public static void main(String[] args) throws IOException {

        /*Appendable out = new PrintWriter("D:/test.csv");
        CSVPrinter printer = CSVFormat.DEFAULT.withHeader("userId", "userName")
                .print(out);
        for (int i = 0; i < 10; i++)
        {
            printer.printRecord("userId" + i, "userName" + i);
        }
        printer.flush();
        printer.close();*/

        String[] heads = {"name", "age", "birthday"};
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"tom", "12", "2012-09-09"});
        data.add(new String[]{"john", "22", "2042-09-09"});
        data.add(new String[]{"apple", "32", "2032-09-09"});
        String path = "D://test.txt";
//        writeCsv(heads,data,path);

        List<CSVRecord> list = readCSV(path, heads);
        CSVRecord csvRecord = list.get(0);
        System.out.println(csvRecord);
        System.out.println(csvRecord.size());
        System.out.println(csvRecord.get(0));
        System.out.println(csvRecord.get("name"));
    }

    /**写入csv文件
     * @param headers 列头
     * @param data 数据内容
     * @param filePath 创建的csv文件路径
     * @throws IOException **/
    public static void writeCsv(String[] headers, List<String[]> data, String filePath) throws IOException {

        //初始化csvformat
        CSVFormat formator = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR);

        //创建FileWriter对象
        FileWriter fileWriter=new FileWriter(filePath);

        //创建CSVPrinter对象
        CSVPrinter printer=new CSVPrinter(fileWriter,formator);

        //写入列头数据
        printer.printRecord(headers);

        if(null!=data){
            //循环写入数据
            for(String[] lineData:data){

                printer.printRecord(lineData);

            }
        }
        // 这两行必须要加，否则写入不了
        printer.flush();
        printer.close();
        System.out.println("CSV文件创建成功,文件路径:"+filePath);

    }

    /**读取csv文件
     * @param filePath 文件路径
     * @param headers csv列头
     * @return CSVRecord 列表
     * @throws IOException **/
    public static List<CSVRecord> readCSV(String filePath, String[] headers) throws IOException{

        //创建CSVFormat
//        CSVFormat formator = CSVFormat.DEFAULT.withHeader(headers);
        CSVFormat formator = CSVFormat.DEFAULT.withDelimiter('|').withRecordSeparator('\n').withHeader(headers);

        FileReader fileReader=new FileReader(filePath);

        //创建CSVParser对象
        CSVParser parser=new CSVParser(fileReader,formator);

        List<CSVRecord> records=parser.getRecords();

        parser.close();
        fileReader.close();

        return records;
    }
}