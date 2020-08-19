package practice.java.file;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class T {
    public static void main(String[] args) throws IOException {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");
        set2.add("b");
        set2.add("c");
        set2.add("d");
//        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));

        final File file = new File("D:\\test");
        final File file1 = new File("D:\\test1");
        for (String s : file.list()) {
            System.out.println(s);
        }
        for (File listFile : file.listFiles()) {
            System.out.println(listFile);
        }

      /*  final Collection<File> files = FileUtils.listFiles(new File("D:\\test"),
                FileFilterUtils, null);
        for (File file2 : files) {
            System.out.println(file2);
        }*/
    }
}
