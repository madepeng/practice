package practice.java.interfaceAndAbstract;

/**
 * @ClassName Impl1
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/11/20
 * @Version V1.0
 **/
public class Impl1 extends Abatract1 {
    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method2() {

    }

    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for(char c:s.toCharArray()){
            index = t.indexOf(c,index+1);
            if(index==-1){return false;}
        }
        return true;
    }
}
