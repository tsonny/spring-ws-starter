package io.typetowrite.springwsstarter.posts;

import io.typetowrite.springwsstarter.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
