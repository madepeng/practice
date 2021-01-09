package design.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Hanfeizi
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/28
 * @Version V1.0
 **/
public class Hanfeizi implements IHanfeizi,Observable{
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子吃饭了");
        notifyObservers("韩非子吃饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子娱乐了");
        notifyObservers("韩非子娱乐了");
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for (Observer observer : observerList) {
            observer.update(content);
        }
    }
}
