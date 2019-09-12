package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/7/5 - 15:50
 */
public class T {
    private String name;
    public T() {
    }

    public T(String name) {
        this.name = name;
    }

    public static T t(){
        return new T("madepeng");
    }

    public static void main(String[] args) throws Exception{
        T t = t();
//        System.out.println(t.name);
//        System.out.println((long)"190816P00072A001181738167".hashCode());

        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
        list.stream().forEach(e -> {
            if(e.length() >= 5) {
                return;
            }
//            System.out.println(e);
        });

        try {
            ttt();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void ttt() throws Exception {
        for (int i = 0; i < 10; i++) {
            try{
                System.out.println(i);
                throw new Exception("i:"+i);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.out.println("ok");
            }
        }
    }
}