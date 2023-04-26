package com.example.bookyy.Controllers;

import com.example.bookyy.Entites.Book;
import com.example.bookyy.Entites.Categories;

import com.example.bookyy.ServicesImpl.BookImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Book")
public class BookController {

   final private BookImpl bookService;


    public BookController(BookImpl bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/all")
    public List<Book> affichertous()
    {
        return bookService.getAll();
    }
    @GetMapping("/find/{cat}")
    public List<Book> afficherparcategories(@PathVariable("cat") Categories Cat ){
        return bookService.getbycat(Cat);
    }
    @GetMapping("/find/id/{id}")
    public Book afficherbook(@PathVariable("id") int id ){
        return bookService.getBybookId(id);
    }
    @PostMapping("/add")
    public Book addbook(@RequestBody Book book){
        return bookService.add(book);
    }
    @PutMapping("/update")
    public  Book updatebook (@RequestBody Book book){
        return bookService.update(book);
    }
    @DeleteMapping("/delete/{id}")
    public void deletebook(@PathVariable("id") int id){
        bookService.remove(id);
    }

}
