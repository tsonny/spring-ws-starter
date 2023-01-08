package io.typetowrite.springwsstarter.jpa;

import io.typetowrite.springwsstarter.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
