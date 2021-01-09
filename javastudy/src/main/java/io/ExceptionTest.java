package io;

import java.io.IOException;

/**
 * @ClassName ExceptionTest
 * @Description: TODO
 * @Author madepeng
 * @Date 2021/1/3
 * @Version V1.0
 **/
public class ExceptionTest {
    public void ttt() throws IOException {
        try {
            throw new RuntimeException("e1");
        }finally {
            throw new IOException("e2");
        }
    }
    public static void main(String[] args) throws IOException {
        ExceptionTest test = new ExceptionTest();
        test.ttt();
    }
}
