package com.dragon.service;

import com.dragon.util.ResultInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2020/05/31 17:08
 */
@FeignClient(value = "log4j2-provider")
@RequestMapping("/log4j2-provider")
public interface ProviderService {

    @GetMapping("/provider/test")
    ResultInfo providerTest();
}
