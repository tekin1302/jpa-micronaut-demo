package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "author2")
public class Author {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
