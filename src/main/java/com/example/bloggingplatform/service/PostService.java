package com.example.bloggingplatform.service;

import com.example.bloggingplatform.Dto.PostDto;
import com.example.bloggingplatform.entity.Category;
import com.example.bloggingplatform.entity.Posts;
import com.example.bloggingplatform.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@Service
public class PostService {
    @Autowired
    private PostRepo repo;
    public void save(Posts post){
        repo.save(post);
    }

    public void delete(int id){
        repo.deleteById(id);
    }
    public Posts getPost(int id){
        List<Posts> list = repo.findAll();
        Posts post = new Posts();
        for (Posts posts : list) {
            if (posts.getPostID() == id) {
                post = posts;
                break;
            }
        }
        return post;
    }

    public List<Posts> getAll(){
        return repo.findAll();
    }

}
