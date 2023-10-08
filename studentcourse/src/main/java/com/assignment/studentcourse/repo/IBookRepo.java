package com.assignment.studentcourse.repo;

import com.assignment.studentcourse.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Integer> {
}
