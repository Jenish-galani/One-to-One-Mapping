package com.example.oneToOne.Repository;

import com.example.oneToOne.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
}
