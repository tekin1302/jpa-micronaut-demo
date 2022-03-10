package com.example.controller;

import com.example.entity.Author;
import com.example.repository.AuthorRepository;
import io.micronaut.http.annotation.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Get
    public Iterable<Author> all() {
        return authorRepository.findCustom();
    }

    @Get("/{id}")
    public Author get(@PathVariable Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Post
    public Author save(@Body Author author) {
        return authorRepository.save(author);
    }
}
