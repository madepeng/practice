package design.observe;

/**
 * @ClassName Observable
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/28
 * @Version V1.0
 **/
public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(String content);
}
