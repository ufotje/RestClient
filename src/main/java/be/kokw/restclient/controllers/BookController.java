package be.kokw.restclient.controllers;


import be.kokw.restclient.entities.Books;
import be.kokw.restclient.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService service;


    @GetMapping("title")
    public String handleGetTitle(ModelMap map) {
        map.addAttribute("books",service.findAllBooks());
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

    @PostMapping("/title")
    public String getBookByTitle(@RequestParam("title") String title, ModelMap model) {
        List<Books> books = service.findBookByTitle(title);
        model.addAttribute("books", books);
        return "books/book";
    }

    @PostMapping("/topic")
    public String getBookByTopic(@RequestParam("topic") String topic, ModelMap model) {
        List<Books> books = service.findBookByTopic(topic);
        model.addAttribute("books", books);
        return "books/book";
    }

    @PostMapping("/author")
    public String getBookByAuthor(@RequestParam("author") String author, ModelMap model) {
        List<Books> books = service.findBookByAuthor(author);
        model.addAttribute("books", books);
        return "books/book";
    }

}
