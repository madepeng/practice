package practice.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Test
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/30 13:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/a" , "b", "c");
        System.out.println(path);

        Path path1 = Paths.get("/d/t/t/h");
        System.out.println(path1);

        System.out.println(path.resolve(path1));
        System.out.println();

        Path path2 =Paths.get("D:\\test", "test.txt");
//        Files.write(path2, "hongda".getBytes());
        byte[] rs = Files.readAllBytes(path2);
        System.out.println(new String(rs, Charset.defaultCharset()));
        System.out.println(Files.readAllLines(path2));

        Files.createDirectories(Paths.get("D:\\te\\te"));
//        Files.createFile(Paths.get("D:\\te\\te\\t.txt"));

        List<Path> ls = Files.walk(Paths.get("D:\\baseTool"), 2).collect(Collectors.toList());
        System.out.println(ls);
        System.out.println(path2.getParent());
        System.out.println(path2.getName(1));
        System.out.println(path2.getFileName());
        System.out.println(path2.getFileSystem());
        System.out.println(path2.getNameCount());
        System.out.println(path2.getRoot());
    }
}