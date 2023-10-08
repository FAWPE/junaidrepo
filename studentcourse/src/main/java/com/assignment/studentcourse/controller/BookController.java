package com.assignment.studentcourse.controller;

import com.assignment.studentcourse.model.Book;
import com.assignment.studentcourse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping("book")
    public Book getBook(@RequestParam Integer bookId){
        return bookService.getBook(bookId);
    }

}
