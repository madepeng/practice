package multiThread.Stop;

/**
 * @ClassName TestNew
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/26
 * @Version V1.0
 **/
public class TestNew {
    public TestNew create() {
        return new TestNew();
    }
    public static void main(String[] args) {
        TestNew testNew = new TestNew();
        System.out.println(testNew.toString());

        System.out.println(testNew.create());
    }
}
