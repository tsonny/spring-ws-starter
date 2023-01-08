package io.typetowrite.springwsstarter.posts;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.typetowrite.springwsstarter.user.User;
import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;
@ManyToOne(fetch = FetchType.LAZY)
@JsonIgnore
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
