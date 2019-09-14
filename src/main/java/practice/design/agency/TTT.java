package practice.design.agency;

import java.util.Scanner;

/**
 * @author 去
 * @description: TODO
 * @date 2019/6/14 - 9:57
 */
public class TTT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
}