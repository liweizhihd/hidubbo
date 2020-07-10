package poc.cloudwise.dubbo.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import poc.cloudwise.dubbo.common.IHiService;

/**
 * @author liweizhi
 * @date 2019/9/4 10:11
 */
@Service
@Component
public class HiServiceImpl implements IHiService {
    @Override
    public String hi(String name) {
        return "Hello," + name + "!";
    }
}
