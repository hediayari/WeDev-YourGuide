package com.example.bookyy.ServicesImpl;

import com.example.bookyy.Entites.Book;
import com.example.bookyy.Entites.Categories;
import com.example.bookyy.Repository.BookRepo;


import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookImpl  {

   final private BookRepo repo;

    public BookImpl(BookRepo repo) {
        this.repo = repo;
    }


    public Book add(Book s) {
        return repo.save(s);
    }


    public Book update(Book s) {
        return repo.save(s);
    }


    public List<Book> getAll() {
        return repo.findAll();
    }


    public Book getBybookId(int id) {
        return repo.findById(id).orElse(null);
    }


    public void remove(int id) {
                repo.deleteById(id);
    }
    public  List<Book> getbycat(Categories cat){
       return repo.findBookparcategories(cat);
    }
}
