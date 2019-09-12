package practice.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author madepeng
 * @description: TODO
 * @date 2019/9/11 - 17:08
 */
@Data
@AllArgsConstructor
public class JavaDeveloper implements Developer {
    private String name;

    @Override
    public void code() {
        System.out.println(this.name + " is coding java");
    }

    @Override
    public void debug() {
        System.out.println(this.name + " is debuging java");
    }
}