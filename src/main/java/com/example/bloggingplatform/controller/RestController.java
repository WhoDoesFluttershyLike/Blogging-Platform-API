package com.example.bloggingplatform.controller;
import com.example.bloggingplatform.Dto.PostDto;
import com.example.bloggingplatform.entity.Category;
import com.example.bloggingplatform.entity.Posts;
import com.example.bloggingplatform.service.CategoryService;
import com.example.bloggingplatform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RequestMapping("/api/v1")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private PostService postService;


    @PostMapping("/create-post")
    public Posts createPost(@RequestBody PostDto postDto) {
        Posts post = new Posts();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setCategory(categoryService.findCategoryByName(postDto.getCategory()));
        post.setCreatedAt(postDto.getCreatedAt());
        postService.save(post);
      return post;
    }
    @PostMapping("/create-category")
    public Category createCategory(@RequestParam String categoryDto) {
        Category category = new Category();
        category.setName(categoryDto);
        categoryService.save(category);
        return category;
    }
    @PutMapping("/update")
    public List<Posts> update(@RequestParam int id, @RequestParam String title, @RequestParam String content,
                         @RequestParam String category) {
        Posts post = postService.getPost(id);
        if (title.isEmpty()) {
            post.setTitle(post.getTitle());
        }
        else {
            post.setTitle(title);
        }
        if (content.isEmpty()){
            post.setContent(post.getContent());
        }
        else {
            post.setContent(content);
        }
        if (category.isEmpty()){
            post.setCategory(post.getCategory());
        }
        else {
            post.setCategory(categoryService.findCategoryByName(category));

        }
        post.setUpdatedAt(new Date());
        postService.save(post);
        return postService.getAll();
    }
    @DeleteMapping ("/delete")
    public void delete(int id) {
        postService.delete(id);
    }
        @GetMapping("/read")
    public Posts read(int id){
        return postService.getPost(id);
        }
    @GetMapping("/read-all")
    public List<Posts> readAll(){
        return postService.getAll();
    }
}
