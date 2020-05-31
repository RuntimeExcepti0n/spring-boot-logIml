package com.dragon.controller;

import com.dragon.service.ProviderService;
import com.dragon.util.ResultInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2020/05/31 16:13
 */
@RestController
@RequestMapping("/consumer")
public class consumerController {

    @Autowired
    ProviderService providerService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/test")
    public ResultInfo test(){
        logger.info("消费者入参");
        return providerService.providerTest();
    }
}
