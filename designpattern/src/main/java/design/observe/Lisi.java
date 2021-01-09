package design.observe;

/**
 * @ClassName Lisi
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/28
 * @Version V1.0
 **/
public class Lisi implements Observer {
    @Override
    public void update(String content) {
        System.out.println("李斯开始报告");
        reportToQinshihuang(content);
        System.out.println("李斯报告完毕");
    }

    private void reportToQinshihuang(String content) {
        System.out.println("报告秦始皇，韩非子活动了：" + content);
    }
}
