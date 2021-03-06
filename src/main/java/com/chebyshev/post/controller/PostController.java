package com.chebyshev.post.controller;

import com.chebyshev.post.application.PostService;
import com.chebyshev.post.dto.PostSaveDto;
import org.springframework.web.bind.annotation.*;

/**
 * @author zwk
 * @date 2022/1/29
 **/
@RestController
@RequestMapping("v1/post")
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping
    public void save(PostSaveDto dto){
        this.service.save(dto);
    }
}
