package com.chebyshev.post.application;

import com.chebyshev.post.dto.PostSaveDto;

/**
 * @author zwk
 * @date 2022/1/29
 **/
public interface PostService {
    void save(PostSaveDto dto);
}
