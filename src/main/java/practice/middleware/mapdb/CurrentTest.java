package practice.middleware.mapdb;

import org.apache.commons.io.FileUtils;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Set;

/**
 * @ClassName CurrentTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/27
 * @Version V1.0
 **/
public class CurrentTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentTest.class);

    public static void main(String[] args) {
        new Thread(() -> {
            File dbFile = new File("D:\\test\\" + "QFINMI_partner_map.db"); //测试路径
            FileUtils.deleteQuietly(dbFile);
            try (DB db = DBMaker.fileDB(dbFile).fileMmapEnable().make()) {
                Set<LoanTransEnty> loanTransSet = db.hashSet("ttt", new SerializerLoanTransEnty()).createOrOpen();
                Thread.sleep(5);
                FileUtils.deleteQuietly(dbFile);
            } catch (Exception e) {
                LOGGER.error("message_alert_job处理单个放款文件csv异常", e);
            }
        },"thread1").start();

        new Thread(() -> {
            File dbFile = new File("D:\\test\\" + "QFINZYXJD_partner_map.db"); //测试路径
            FileUtils.deleteQuietly(dbFile);
            try (DB db = DBMaker.fileDB(dbFile).fileMmapEnable().make()) {
                Set<LoanTransEnty> loanTransSet = db.hashSet("ggg", new SerializerLoanTransEnty()).createOrOpen();
                Thread.sleep(5);
                FileUtils.deleteQuietly(dbFile);
            } catch (Exception e) {
                LOGGER.error("message_alert_job处理单个放款文件csv异常", e);
            }
        },"thread2").start();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            new Thread(() -> {
                File dbFile = new File("D:\\test\\" + finalI + "tmp113.db"); //测试路径
                FileUtils.deleteQuietly(dbFile);
                try (DB db = DBMaker.fileDB(dbFile).fileMmapEnable().closeOnJvmShutdown().concurrencyDisable().fileDeleteAfterClose().make()) {
                    Set<String> ttt2 = db.hashSet("test3", Serializer.STRING).createOrOpen();

                    FileUtils.deleteQuietly(dbFile);
                } catch (Exception e) {
                    LOGGER.error("message_alert_job处理单个放款文件csv异常", e);
                }
            },"thread3").start();
        }



    }
}
