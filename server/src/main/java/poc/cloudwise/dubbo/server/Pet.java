package poc.cloudwise.dubbo.server;

import lombok.Data;

/**
 * @author liweizhi
 * @date 2019/9/4 11:51
 */
@Data
public class Pet {
    private String id;
    private String name;
    private int age;
    private String color;
}
