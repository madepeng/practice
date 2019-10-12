package practice.file;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
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
       /* byte[] rs = Files.readAllBytes(path2);
        System.out.println(new String(rs, Charset.defaultCharset()));
        System.out.println(Files.readAllLines(path2));*/

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
        System.out.println(FilenameUtils.getBaseName(" M80100000099-balanceDetail-20190816.txt.ok"));

        File file = new File("/opt/pas/pbs_backup/upp04/upp0040002/M80100000099-balanceDetail-20190816.txt");
        System.out.println(file.getPath());

        File file1 = new File("D:\\test");
        Collection<File> cs = FileUtils.listFiles(file1, FileFilterUtils.suffixFileFilter("txt"),null);
        System.out.println(cs);

        File file2 = new File("D:\\test\\mm.txt");
//        FileUtils.moveFileToDirectory(file2, new File("D://t"),true);
//        FileUtils.moveFile(new File("D://t//mm.txt"),new File("D:\\test\\mm.txt"));
      /*  System.out.println(new File("D://t//test.txt").createNewFile());
        File file3 = new File("D://test//mm.txt");
        List<String> ls1 = FileUtils.readLines(file3);
        System.out.println(ls1);*/
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getCanonicalPath());

    }
}