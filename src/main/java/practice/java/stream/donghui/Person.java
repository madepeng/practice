package practice.java.stream.donghui;

import lombok.*;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author madepeng
 * @Date 2020/10/17
 * @Version V1.0
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private Integer id;
    private String date;

    @Override
    public int hashCode() {
        /*int hashno = 7;
        hashno = 13 * hashno + (id == null ? 0 : id.hashCode());*/
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Person p = (Person) obj;
        if (this == p) {
            return true;
        } else {
            return (this.id.equals(p.id));
        }
    }
}
