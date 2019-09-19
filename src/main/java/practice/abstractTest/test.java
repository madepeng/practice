package practice.abstractTest;

/**
 * @ClassName test
 * @Description TODO
 * @Author madepeng
 * @Date 2019/9/19 10:48
 * @Version 1.0
 */

public class test {

    public static void main(String[] args) {
        AProduct a = new AProduct("呵呵");
        a.print();
        a.printBefore();

        System.out.println("=========");
        BProduct b = new BProduct("哈哈");
        b.print();
        b.printBefore();


    }
}

interface IProduct {
    void print(); // 这是要暴露的方法
}

abstract class AbstractProduct implements IProduct {
    public AbstractProduct() {
        // TODO Auto-generated constructor stub
    }

    protected void printBefore() {
        System.out.println("before print"); // 这里所公共的实现
    }
}

class AProduct extends AbstractProduct {
    private String name;

    public AProduct(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        super.printBefore();
        System.out.println("print A >>>" + name);
    }
}

class BProduct extends AbstractProduct {
    private String name;

    public BProduct(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        super.printBefore();
        System.out.println("print B >>>" + name);
    }
}