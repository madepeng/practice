package practice.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName T2
 * @Description: ceui
 * @Author madepeng
 * @Date 2019/12/24
 * @Version V1.0
 **/
public class T2 {
    public static void main(String[] args) throws IOException {
       /* List<String> strings = FileUtils.readLines(new File("D:\\etcbackup\\20191205\\flag"), StandardCharsets.UTF_8);
        System.out.println(strings);
        System.out.println(strings.contains("down"));
        System.out.println(strings.contains("20191205_download"));
        System.out.println(strings.equals("down"));*/

        List<String> list = new ArrayList<>();
        list.add("sss");
        System.out.println(list);
        list.remove("ttt");
        System.out.println(list);
        list.remove("sss");
        System.out.println(list);

        String s = "P00087A001";
        System.out.println(s.substring(0,7));

        Path path = Paths.get("D:\\test.txt");
        System.out.println(Files.isRegularFile(path));
    }
}
