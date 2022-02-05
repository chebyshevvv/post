package com.chebyshev.post.application.intenal;

import com.chebyshev.post.application.PostService;
import com.chebyshev.post.domain.Post;
import com.chebyshev.post.domain.PostRepository;
import com.chebyshev.post.dto.PostSaveDto;
import org.springframework.stereotype.Service;

/**
 * @author zwk
 * @date 2022/1/29
 **/
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

    public PostServiceImpl(PostRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(PostSaveDto dto) {
        Post post = Post.create(dto.getTitle(),dto.getContent());
        this.repository.save(post);
    }
}
