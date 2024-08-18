package com.example.bloggingplatform.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryID;
    @Column(unique = true, nullable = false)
    private String name;
}
