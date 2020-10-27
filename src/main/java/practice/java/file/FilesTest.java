package practice.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName FilesTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/27
 * @Version V1.0
 **/
public class FilesTest {
    public static void main(String[] args) {
        try {
            Stream<Path> list = Files.list(Paths.get("D:\\test"));
            List<Path> collect = list.collect(Collectors.toList());
            System.out.println(collect);
            System.out.println(collect.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
