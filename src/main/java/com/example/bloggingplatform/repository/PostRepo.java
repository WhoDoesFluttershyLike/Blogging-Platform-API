package com.example.bloggingplatform.repository;

import com.example.bloggingplatform.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepo extends JpaRepository<Posts, Integer> {
}
