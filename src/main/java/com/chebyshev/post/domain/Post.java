package com.chebyshev.post.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.AbstractAggregateRoot;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author zwk
 * @date 2022/1/29
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Post extends AbstractAggregateRoot<Post> {
    private @Id String id;
    private String title;
    private String content;
    private LocalDateTime dateTime;

    public static Post create(String title,String content){
        return new Post(UUID.randomUUID().toString().replaceAll("-",""),title,content,LocalDateTime.now());
    }
}
