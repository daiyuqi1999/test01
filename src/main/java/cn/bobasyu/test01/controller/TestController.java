package cn.bobasyu.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Boba
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/address")
    public String address() {
        return "address";
    }
}
