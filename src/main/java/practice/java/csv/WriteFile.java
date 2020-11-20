package practice.java.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @ClassName WriteFile
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/11/16
 * @Version V1.0
 **/
public class WriteFile {
    private static final char DELIMITER = '|';
    private static final char RECORD_SEPARATOR = '\n';

    public static void main(String[] args) throws IOException {
        CSVFormat csvFormat = CSVFormat.DEFAULT.withDelimiter(DELIMITER).withRecordSeparator(RECORD_SEPARATOR);
        try (CSVPrinter printer = new CSVPrinter(Files.newBufferedWriter(Paths.get("D:\\test\\test.txt")), csvFormat)) {


            /*for (int i = 0; i < 10; i++) {
                appendWorkbook(printer, i, i);

            }
            printer.flush();


            for (int i = 10; i < 20; i++) {
                appendWorkbook(printer, i, i);

            }*/
            printer.flush();
        }

    }


    private static void appendWorkbook(CSVPrinter printer, int index, int x) throws IOException {
        printer.printRecord(
                index,
                x
        );
    }
}
