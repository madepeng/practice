package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 去
 * @description: TODO
 * @date 2019/10/5 - 11:01
 */
public class T1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:","test");
        /*System.out.println(path.endsWith("迅雷下载"));
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getName(0));
        System.out.println(path.getNameCount());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.isAbsolute());
        System.out.println(path.normalize());
        System.out.println(path.subpath(0,2));
        System.out.println(path.toUri());*/
        /*System.out.println(Files.size(path));
        System.out.println(Files.exists(path));
        System.out.println(Files.getFileStore(path));
        System.out.println(Files.getOwner(path));
        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isReadable(path));*/
  /*      System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isSymbolicLink(path));
        System.out.println(Files.isWritable(path));*/
        Files.createDirectories(path);
        Path fp = path.resolve("test.txt");
        Files.createFile(fp);
        Files.createFile(path);
    }
}