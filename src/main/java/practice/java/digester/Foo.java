package practice.java.digester;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Foo
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/12/4
 * @Version V1.0
 **/
@Data
public class Foo {
    private String name;
    private List<Bar> barList = new ArrayList<Bar>();

    public void addBar(Bar bar)
    {
        barList.add(bar);
    }

    public Bar findBar(int id)
    {
        for (Bar bar : barList)
        {
            if (bar.getId() == id)
            {
                return bar;
            }
        }
        return null;
    }

    public Iterator<Bar> getBars()
    {
        return barList.iterator();
    }

}
