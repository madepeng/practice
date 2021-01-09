package pathAndFiles;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/24
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\test");
        try(Stream<Path> walk = Files.walk(path)){
            List<Path> collect = walk.collect(Collectors.toList());
            System.out.println(collect);

            System.out.println(Files.exists(path, LinkOption.NOFOLLOW_LINKS));;
        }catch (Exception e){
            e.printStackTrace();
        }


        Path path1 = Paths.get("/opt/ccs/ccs09/ftsdata/receivefile/ccs02/ccs0036001/_QFIN_loan_trans.csv");
        Path name = path1.getName(path1.getNameCount() - 1);
        System.out.println(name);
        System.out.println(name.toString().split("\\_")[1]);
    }
}
