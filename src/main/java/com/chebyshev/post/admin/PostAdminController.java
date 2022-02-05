package com.chebyshev.post.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zwk
 * @date 2022/2/5
 * @description TODO
 **/
@Controller
@RequestMapping("post/admin")
public class PostAdminController {

    @GetMapping("home")
    public String home(){
        return "index";
    }
}
