package com.hqf.blogboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/visit")
public class VisitorController {
    Logger logger= LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        return "111";
    }


}
