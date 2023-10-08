package com.assignment.studentcourse.service;

import com.assignment.studentcourse.model.Book;
import com.assignment.studentcourse.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;
    public String addBook(Book book) {
        bookRepo.save(book);
        return "book added";
    }

    public Book getBook(Integer bookId) {
        return bookRepo.findById(bookId).orElseThrow();
    }
}
