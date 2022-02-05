package com.chebyshev.post.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author zwk
 * @date 2022/1/29
 **/
@Repository
public interface PostRepository extends JpaRepository<Post,String> {
}
