package com.zjkhzgm.eurekafeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgm
 * Date: 2020/01/14 16:36
 */
@FeignClient("eureka-provider")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
