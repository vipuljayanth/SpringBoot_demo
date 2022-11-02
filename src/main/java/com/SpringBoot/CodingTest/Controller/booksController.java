
    package com.SpringBoot.CodingTest.Controller;

import com.SpringBoot.CodingTest.Entity.Book;
import com.SpringBoot.CodingTest.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    public class BooksController {
        @Autowired
        private BookService service;
        @PostMapping("/addBook")
        public String addBookDetails(@RequestBody Book book){
            return service.saveBookDetails(book);
        }
        @PostMapping("/addBooks")
        public List<Book> addBookDetails(@RequestBody List<Book> books){
            return service.saveBooksDetails(books);
        }
        @GetMapping("/books")
        public List<Book> findAllBooks(){
            return  service.getBookDetails();
        }
        @DeleteMapping("/deleteBookDetails")
        public String deleteBookDetails(@PathVariable int bookId){
            return service.deleteBookDetails(bookId);
        }
        @PutMapping("/updateBookDetails")
        public Book updateBookDetails(@RequestBody Book book){
            return service.updateBookDetails(book);
        }
    }

