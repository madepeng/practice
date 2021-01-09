package design.observe;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/28
 * @Version V1.0
 **/
public class Client {
    public static void main(String[] args) {
        Hanfeizi hanfeizi = new Hanfeizi();
        Observer lisi = new Lisi();
        hanfeizi.addObserver(lisi);
        hanfeizi.haveBreakfast();
    }
}
