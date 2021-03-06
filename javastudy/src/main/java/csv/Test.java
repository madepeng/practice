package csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

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
    private final static char Delimiter= '|';

    public static void main(String[] args) throws IOException {
        String path = "D://test.txt";
        String[] heads = {"name", "age", "birthday","addres"};
       /*
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"tom", "12", "2012-09-09","beijing"});
        data.add(new String[]{"john", "22", "2042-09-09","shanghai"});
        data.add(new String[]{"apple", "32", "2032-09-09","xuchang"});
        writeCsv(heads,data,path);*/


        List<CSVRecord> list = readCSV(path, heads);
        for (CSVRecord csvRecord : list) {
//            System.out.println(csvRecord);
            System.out.println(csvRecord.getComment());
            System.out.println(csvRecord.toMap());
//            System.out.println(csvRecord.size());
//            System.out.println(csvRecord.get(0));
//            System.out.println(csvRecord.get("name"));
        }
    }

    /**写入csv文件
     * @param headers 列头
     * @param data 数据内容
     * @param filePath 创建的csv文件路径
     * @throws IOException **/
    public static void writeCsv(String[] headers, List<String[]> data, String filePath) throws IOException {

        //初始化csvformat
        CSVFormat formator = CSVFormat.DEFAULT.withRecordSeparator(NEW_LINE_SEPARATOR).withDelimiter(Delimiter);

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
        CSVFormat formator = CSVFormat.DEFAULT.withDelimiter('|').withRecordSeparator('\n').withHeader(headers);

        FileReader fileReader=new FileReader(filePath);

        //创建CSVParser对象
        CSVParser parser=new CSVParser(fileReader,formator);

        List<CSVRecord> records=parser.getRecords();
        removeEmptyRecord(records);
        System.out.println(records);

        parser.close();
        fileReader.close();

        return records;
    }

    private static List<CSVRecord> removeEmptyRecord(List<CSVRecord> records){
        ListIterator<CSVRecord> iterator = records.listIterator();
        while (iterator.hasNext()) {
            CSVRecord record = iterator.next();
            if (isEmptyRecord(record)) {
                iterator.remove();
            }
        }

        return records;
    }

    private static boolean isEmptyRecord(CSVRecord record){
        return record.size() == 1 && StringUtils.isBlank(record.get(0));
    }
}