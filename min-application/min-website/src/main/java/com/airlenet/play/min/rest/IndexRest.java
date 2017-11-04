package com.airlenet.play.min.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author airlenet
 * @version 2017-11-04
 */
@RestController
public class IndexRest {

    @RequestMapping(value = {"","/"})
    @ResponseBody
    public Object getIndex(){
        return "index";
    }
}
