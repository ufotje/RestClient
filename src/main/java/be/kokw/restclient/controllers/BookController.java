package be.kokw.restclient.controllers;


import be.kokw.restclient.entities.Books;
import be.kokw.restclient.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService service;


    @GetMapping("allBooks")
    public String handleGetAllBooks(ModelMap map) {
        map.addAttribute("books",service.findAllBooks());
        return "/books/allBooks";
    }

    @GetMapping("title")
    public ModelAndView handleGetTitle(){
        String title = "Zoek boeken op titel!";
        return new ModelAndView("/books/title", "title", title );
    }

    @GetMapping("topic")
    public ModelAndView handleGetTopic() {
        String title = "Zoek boeken op topic!";
        return new ModelAndView("/books/title", "title", title );
    }

    @GetMapping("author")
    public ModelAndView handleGetAuthor() {
        String title = "Zoek boeken op auteur!";
        return new ModelAndView("/books/title", "title", title );
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
