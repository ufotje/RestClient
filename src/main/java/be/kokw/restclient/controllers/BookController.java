package be.kokw.restclient.controllers;


import be.kokw.restclient.entities.Book;
import be.kokw.restclient.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {
    @Autowired
    private BookService service;


    @GetMapping("title")
    public String handleGetTitle() {
        return "/books/title";
    }

    @GetMapping("topic")
    public String handleGetTopic() {
        return "/books/topic";
    }

    @GetMapping("author")
    public String handleGetAuthor() {
        return "/books/author";
    }

    @GetMapping("{title}")
    public String getBookByTitle(@PathVariable("title") String title, ModelMap model) {
        Book book = service.findBookByTitle(title);
        model.addAttribute("book", book);
        return "books/book";
    }

}
