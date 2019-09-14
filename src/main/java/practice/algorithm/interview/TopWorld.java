package practice.algorithm.interview;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author madepeng
 * @description: 支持持续输入英文文件具体是指？ 程序需要考虑未来需求的扩展性主要是指？
 * @date 2019/6/23 - 22:28
 */
public class TopWorld {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        getTopNWords("C:\\Users\\去\\Desktop\\Sample\\Sample1.txt", 10);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }

    /**
     *
     * @param filePath 读取的文件路径
     * @param count  最高频的n个单词count个
     * @throws IOException
     */
    private static void getTopNWords(String filePath, int count) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        StringBuffer sb = new StringBuffer();
        String text =null;
        while ((text=br.readLine())!= null){
            sb.append(text);// 将读取出的字符追加到stringbuffer中
        }
        br.close();  // 关闭读入流

        String str = sb.toString().toLowerCase(); // 将stringBuffer转为字符并转换为小写
        String[] words = str.split("[^(a-zA-Z)]+");  // 非单词的字符来分割，得到所有单词
        Map<String ,Integer> map = new HashMap<String, Integer>() ;

        for(String word :words){
            if(map.get(word)==null){  // 若不存在说明是第一次，则加入到map,出现次数为1
                map.put(word,1);
            }else{
                map.put(word,map.get(word)+1);  // 若存在，次数累加1
            }
        }

        // 排序
        List<Map.Entry<String ,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

        // 比较器，按照value逆序排列
        Comparator<Map.Entry<String,Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> left, Map.Entry<String, Integer> right) {
                return (left.getValue().compareTo(right.getValue()));
            }
        };

        Collections.sort(list,comparator);

        int i = 0;
        while (count > 0){
            Map.Entry<String, Integer> temp =list.get(list.size() - i - 1);
            System.out.println(temp.getKey() + ":" + temp.getValue());
            i++;
            count--;
        }

    }
}