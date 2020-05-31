package com.dragon.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description TODO
 * @Author Administrator
 * @Date 2020/05/31 16:06
 */
@RestController
@RequestMapping("provider")
public class ApiController {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/test")
    public ResultInfo test(){
        logger.info("进入provider");
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode("0");
        resultInfo.setData("data");
        resultInfo.setMassage("message");
        return resultInfo;
    }
}
