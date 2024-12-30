package com.example.oneToOne.Service;

import com.example.oneToOne.Models.Book;
import com.example.oneToOne.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServ {
    @Autowired
    private BookRepo repo;
    public void save(Book book){
        repo.save(book);
    }

    public void deleteById(Long myId){
        repo.deleteById(myId);
    }

    public Optional<Book> getOne(Long myId) {
        return repo.findById(myId);
    }

    public void deleteOne(Long myId) {
        repo.deleteById(myId);
    }

    public void updateOne(Book book){
        repo.save(book);
    }

    public List<Book> getAll() {
        return repo.findAll();
    }
}

