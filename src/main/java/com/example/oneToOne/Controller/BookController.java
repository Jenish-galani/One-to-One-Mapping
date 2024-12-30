package com.example.oneToOne.Controller;
import com.example.oneToOne.Models.Book;
import com.example.oneToOne.Service.BookServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    private BookServ serv;

    //Use for insert record
    @PostMapping()
    public String save(@RequestBody Book book) {
        serv.save(book);
        return "Record successfully inserted";
    }

    //Use for specific record update by id
    @PutMapping("id/{myId}")
    public String updateRecord(@RequestBody Book book){
        serv.save(book);
        return "Record successfully updated";
    }

    //Use for specific record delete by id
    @DeleteMapping("id/{myId}")
    public String deleteById(@PathVariable Long myId){
        serv.deleteOne(myId);
        return "Record successfully deleted";
    }

    //Use for specific record get by id
    @GetMapping("id/{myId}")
    public Optional<Book> getOne(@PathVariable Long myId) {
        return serv.getOne(myId);
    }

    //Use for all records get
    @GetMapping()
    public List<Book> getAll(){
        return serv.getAll();
    }
}

