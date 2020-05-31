package com.dragon.controller;

import com.dragon.service.ProviderService;
import com.dragon.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2020/05/31 13:38
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ApplicationContext context;

    @Autowired
    ProviderService providerService;

    @Autowired
    Environment environment;

    @GetMapping("/test")
    public void test(){
        try {
            Class.forName("Sdd");
        } catch (ClassNotFoundException e) {
            logger.error("异常信息{}",e);
//            e.printStackTrace();
        }
        String a = "SDFSDsdfsdfsd";
        logger.info("测试日志打印{}",a);
    }

    @GetMapping("/test2")
    public ResultInfo test2(){
        logger.info("消费者入参");
        return providerService.providerTest();
    }

}
