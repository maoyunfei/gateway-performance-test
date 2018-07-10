package com.example.backendservicedemo.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/7/10
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(@RequestParam long delay,
                       @RequestParam int length) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return StringUtils.repeat("a", length);
    }
}
