package com.zjkhzgm.eurekafeignuploadserver.service;

import com.zjkhzgm.eurekafeignuploadserver.config.MultipartSupportConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zgm
 * Date: 2020/01/15 14:28
 */
@FeignClient(value = "eureka-consumer-feign", configuration = MultipartSupportConfig.class)
public interface UploadService {

    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    String handleFileUpload(@RequestPart(value = "file") MultipartFile file);

}
