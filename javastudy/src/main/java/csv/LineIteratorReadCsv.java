package csv;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName LineIteratorReadCsv
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/31
 * @Version V1.0
 **/
public class LineIteratorReadCsv {
    public static void main(String[] args) throws IOException {
        LineIterator it = FileUtils.lineIterator(new File("D:\\test\\20200818_QFIN_loan_trans.csv"), "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                System.out.println(line);
            }
        } finally {
            LineIterator.closeQuietly(it);
        }
    }
}
