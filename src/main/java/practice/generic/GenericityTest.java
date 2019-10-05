package practice.generic;

/**
 * @ClassName GenericityTest
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/23 14:04
 * @Version 1.0
 */
public class GenericityTest {
    public static void main(String[] args) {
        // 这里只测试Son6和Son8 其他很简单，自己测试吧！
        Father<Double> father1 = new Son1<>(4.44);
        Son1<Double> father2 = new Son1<>(4.44);
        System.out.println(father1);
        System.out.println(father2);

        Son2<Integer, String> son2 = new Son2("mad", 11);
        System.out.println(son2);

        Son3 son3 = new Son3("fdf");
        System.out.println(son3);

        Son4 son4 = new Son4(333);
        System.out.println(son4);

        Son5<Double> son5 = new Son5(111,5.5555);
        System.out.println(son5);

        Son6<String> son6 = new Son6("fdfsdffggs", "fdsfdsf");
        System.out.println(son6);

//        Son7 son7 = new Son7("fdsf");

        System.out.println(new Son6<String>("son6", "son6"));// 构造函数两个参数类型一样的

        Son8<Number, Integer> son8 = new Son8<>(6.44, 6);
        System.out.println(son8);

        System.out.println(new Son8<Number, Long>(8, 8L));// 构造函数 两个参数具有父子关系
    }
}

class Father<T> {
    T data;

    public Father(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Father [data=" + data + "]";
    }

}

class Son1<T> extends Father<T> {// 最正常的继承，子类的泛型参数和父类的参数是一致的

    public Son1(T data) {
        super(data);
    }

    @Override
    public String toString() {
        return "Son1 [data=" + data + "]";
    }

}

class Son2<E, F> extends Father<F> {// 子类增加了一个泛型参数，父类的泛型参数不能遗漏，所以仍然要定义

    E otherData;

    public Son2(F data, E otherData) {
        super(data);
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "Son2 [otherData=" + otherData + ", data=" + data + "]";
    }

}

class Son3 extends Father {// 继承时不指定父类的泛型参数,会有警告信息：Father is a raw type.
    // References to generic type Father<T> should be
    // parameterized


    public Son3(Object data) {
        super(data);
    }

    @Override
    public String toString() {
        return "Son3{" +
                "data=" + data +
                '}';
    }
}

// 继承时指定父类的泛型参数，子类就不用再写泛型参数，如果写了，那就是子类自己新增加的
class Son4 extends Father<Integer> {

    public Son4(Integer data) {
        super(data);
    }

    @Override
    public String toString() {
        return "Son4 [data=" + data + "]";
    }

}

// 父类指定了类型，子类又增加了，这时子类的只是新增加的泛型参数，跟父类没有关系
class Son5<T> extends Father<Integer> {
    T otherData;

    public Son5(Integer data, T otherData) {
        super(data);
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "Son5 [otherData=" + otherData + ", data=" + data + "]";
    }

}

// 子类的泛型参数是Integer 这个是我无意使用的，当然真实项目是绝对不允许这样使用的，一般泛型参数命名都是单个大写字母
// 这里使用只是来说明万一泛型参数和一个类名相同了，别糊涂了（相同了都是来故意迷糊人的）
// 这里的Integer 不是java.lang.Integer 它只是一个泛型参数名称 ，恰好相同，跟Son1是没有区别的
// 它出现这里会把类中所有的Integer(java.lang.Integer) 都替换成 泛型参数
// 警告提示：The type parameter Integer is hiding the type Integer
// 所以传给父类的Integer，也不是java.lang.Integer，也只是一个类型参数
class Son6<Integer> extends Father<Integer> {

    Integer otherData;// 它是什么类型呢？java.lang.Integer？NONONO 只能说不确定！

    public Son6(Integer data, Integer otherData) {
        super(data);
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "Son6 [otherData=" + otherData + ", data=" + data + "]";
    }

}
// 下面是错误的情况 父类的类型参数不明确，这会让编译器迷糊 ，让它迷糊了，就是错了！
 class Son7 extends Father<T>{

    public Son7(T data) {
        super(data);
    }

    @Override
    public String toString() {
        return "Son7{" +
                "data=" + data +
                '}';
    }
}

// 父类和子类的泛型参数具有关系
class Son8<T, E extends T> extends Father<T> {

    E otherData;

    public Son8(T data, E otherData) {
        super(data);
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "Son8 [otherData=" + otherData + ", data=" + data + "]";
    }

}

