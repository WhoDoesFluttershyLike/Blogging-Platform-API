package com.example.bloggingplatform.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PostDto {
    private String title;
    private String content;
    private String category;
    private Date createdAt = new Date();
}

