package poc.cloudwise.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.cloudwise.dubbo.common.IHiService;

/**
 * @author liweizhi
 * @date 2019/9/3 10:08
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Reference
    private IHiService hiService;

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return hiService.hi(name);
    }

    public static void main(String[] args) {

    }
}
