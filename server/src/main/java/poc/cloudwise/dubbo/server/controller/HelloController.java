package poc.cloudwise.dubbo.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liweizhi
 * @date 2019/9/3 10:08
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    public static void main(String[] args) {

    }
}
